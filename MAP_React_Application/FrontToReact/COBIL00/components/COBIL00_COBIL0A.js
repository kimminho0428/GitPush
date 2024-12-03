import React, {useCallback, useEffect, useLayoutEffect, useMemo, useRef, useState} from 'react';
import COBIL00_COBIL0AView from "./COBIL00_COBIL0AView";
import {observer} from "mobx-react";
import useStore from "../store/UseStore";
import Notification from "../runtime/component/notification/Notification";

const COBIL00_COBIL0A = observer(({history, location, children}) => {

    const serverUrl = location.state.url;
    const data = location.state.response;
    const parsedData = data.COBIL0AO;
    const systemDto = data.systemDto;

    const { COBIL00_COBIL0AStore, SystemStore } = useStore();

    const TRNNAMERef = useRef(COBIL00_COBIL0AStore.TRNNAME);
    const TITLE01Ref = useRef(COBIL00_COBIL0AStore.TITLE01);
    const CURDATERef = useRef(COBIL00_COBIL0AStore.CURDATE);
    const PGMNAMERef = useRef(COBIL00_COBIL0AStore.PGMNAME);
    const TITLE02Ref = useRef(COBIL00_COBIL0AStore.TITLE02);
    const CURTIMERef = useRef(COBIL00_COBIL0AStore.CURTIME);
    const ACTIDINRef = useRef(COBIL00_COBIL0AStore.ACTIDIN);
    const CURBALRef = useRef(COBIL00_COBIL0AStore.CURBAL);
    const CONFIRMRef = useRef(COBIL00_COBIL0AStore.CONFIRM);
    const ERRMSGRef = useRef(COBIL00_COBIL0AStore.ERRMSG);



    const onKeyPressedACTIDIN = event => {
      COBIL00_COBIL0AStore.setACTIDIN(event.target.value);
      if(event.target.value.length >= 11.0) {
        CONFIRMRef.current.focus();
      }
    }
    const onKeyPressedCONFIRM = event => {
      COBIL00_COBIL0AStore.setCONFIRM(event.target.value);
      if(event.target.value.length >= 1.0) {
        ACTIDINRef.current.focus();
      }
    }


    const keyEvent = useCallback((event) => {
        if(event.keyCode === 13) {
            COBIL00_COBIL0AStore.request(systemDto, event.keyCode, serverUrl, history, ACTIDINRef, CONFIRMRef);
        } else if(event.keyCode >= 112 && event.keyCode <= 123) {
            event.preventDefault();
            COBIL00_COBIL0AStore.request(systemDto, event.keyCode, serverUrl, history, ACTIDINRef, CONFIRMRef);
        }
    });

    useEffect (() => {
        document.addEventListener('keydown', keyEvent, false);
        COBIL00_COBIL0AStore.renderStyle(parsedData  ,TRNNAMERef ,TITLE01Ref ,CURDATERef ,PGMNAMERef ,TITLE02Ref ,CURTIMERef ,ACTIDINRef ,CURBALRef ,CONFIRMRef ,ERRMSGRef);
         ACTIDINRef.current.focus();
        return () => {
            document.removeEventListener('keydown', keyEvent, false);
        }
    }, []);

    const render = useMemo(() => {
        if(systemDto.immediate === true) {
          COBIL00_COBIL0AStore.simpleRequest(systemDto, 13, serverUrl, history);
        } else {
            if(parsedData !== null) {
              SystemStore.setToggle(true);
              COBIL00_COBIL0AStore.render(parsedData);
            }
        }

    }, [location, systemDto.immediate]);

    const notificationHandleClose = () => {
        SystemStore.setToggle(false);
    };

    return (
        <>
            {render}
            <COBIL00_COBIL0AView
                location = {location}
                onKeyPressedACTIDIN = { onKeyPressedACTIDIN }
                onKeyPressedCONFIRM = { onKeyPressedCONFIRM }
                TRNNAMERef = { TRNNAMERef }
                TITLE01Ref = { TITLE01Ref }
                CURDATERef = { CURDATERef }
                PGMNAMERef = { PGMNAMERef }
                TITLE02Ref = { TITLE02Ref }
                CURTIMERef = { CURTIMERef }
                ACTIDINRef = { ACTIDINRef }
                CURBALRef = { CURBALRef }
                CONFIRMRef = { CONFIRMRef }
                ERRMSGRef = { ERRMSGRef }
            />
            {systemDto.notification ? <Notification data = {systemDto.notification} toggle={SystemStore.toggle}
            handleClose = {notificationHandleClose}/> : null}
        </>
    );

});
export default COBIL00_COBIL0A;

