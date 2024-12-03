import React, {useCallback, useEffect, useLayoutEffect, useMemo, useRef, useState} from 'react';
import COUSR03_COUSR3AView from "./COUSR03_COUSR3AView";
import {observer} from "mobx-react";
import useStore from "../store/UseStore";
import Notification from "../runtime/component/notification/Notification";

const COUSR03_COUSR3A = observer(({history, location, children}) => {

    const serverUrl = location.state.url;
    const data = location.state.response;
    const parsedData = data.COUSR3AO;
    const systemDto = data.systemDto;

    const { COUSR03_COUSR3AStore, SystemStore } = useStore();

    const TRNNAMERef = useRef(COUSR03_COUSR3AStore.TRNNAME);
    const TITLE01Ref = useRef(COUSR03_COUSR3AStore.TITLE01);
    const CURDATERef = useRef(COUSR03_COUSR3AStore.CURDATE);
    const PGMNAMERef = useRef(COUSR03_COUSR3AStore.PGMNAME);
    const TITLE02Ref = useRef(COUSR03_COUSR3AStore.TITLE02);
    const CURTIMERef = useRef(COUSR03_COUSR3AStore.CURTIME);
    const USRIDINRef = useRef(COUSR03_COUSR3AStore.USRIDIN);
    const FNAMERef = useRef(COUSR03_COUSR3AStore.FNAME);
    const LNAMERef = useRef(COUSR03_COUSR3AStore.LNAME);
    const USRTYPERef = useRef(COUSR03_COUSR3AStore.USRTYPE);
    const ERRMSGRef = useRef(COUSR03_COUSR3AStore.ERRMSG);



    const onKeyPressedUSRIDIN = event => {
      COUSR03_COUSR3AStore.setUSRIDIN(event.target.value);
      if(event.target.value.length >= 8.0) {
        USRIDINRef.current.focus();
      }
    }


    const keyEvent = useCallback((event) => {
        if(event.keyCode === 13) {
            COUSR03_COUSR3AStore.request(systemDto, event.keyCode, serverUrl, history, USRIDINRef);
        } else if(event.keyCode >= 112 && event.keyCode <= 123) {
            event.preventDefault();
            COUSR03_COUSR3AStore.request(systemDto, event.keyCode, serverUrl, history, USRIDINRef);
        }
    });

    useEffect (() => {
        document.addEventListener('keydown', keyEvent, false);
        COUSR03_COUSR3AStore.renderStyle(parsedData  ,TRNNAMERef ,TITLE01Ref ,CURDATERef ,PGMNAMERef ,TITLE02Ref ,CURTIMERef ,USRIDINRef ,FNAMERef ,LNAMERef ,USRTYPERef ,ERRMSGRef);
         USRIDINRef.current.focus();
        return () => {
            document.removeEventListener('keydown', keyEvent, false);
        }
    }, []);

    const render = useMemo(() => {
        if(systemDto.immediate === true) {
          COUSR03_COUSR3AStore.simpleRequest(systemDto, 13, serverUrl, history);
        } else {
            if(parsedData !== null) {
              SystemStore.setToggle(true);
              COUSR03_COUSR3AStore.render(parsedData);
            }
        }

    }, [location, systemDto.immediate]);

    const notificationHandleClose = () => {
        SystemStore.setToggle(false);
    };

    return (
        <>
            {render}
            <COUSR03_COUSR3AView
                location = {location}
                onKeyPressedUSRIDIN = { onKeyPressedUSRIDIN }
                TRNNAMERef = { TRNNAMERef }
                TITLE01Ref = { TITLE01Ref }
                CURDATERef = { CURDATERef }
                PGMNAMERef = { PGMNAMERef }
                TITLE02Ref = { TITLE02Ref }
                CURTIMERef = { CURTIMERef }
                USRIDINRef = { USRIDINRef }
                FNAMERef = { FNAMERef }
                LNAMERef = { LNAMERef }
                USRTYPERef = { USRTYPERef }
                ERRMSGRef = { ERRMSGRef }
            />
            {systemDto.notification ? <Notification data = {systemDto.notification} toggle={SystemStore.toggle}
            handleClose = {notificationHandleClose}/> : null}
        </>
    );

});
export default COUSR03_COUSR3A;

