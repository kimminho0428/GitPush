import React, {useCallback, useEffect, useLayoutEffect, useMemo, useRef, useState} from 'react';
import COUSR02_COUSR2AView from "./COUSR02_COUSR2AView";
import {observer} from "mobx-react";
import useStore from "../store/UseStore";
import Notification from "../runtime/component/notification/Notification";

const COUSR02_COUSR2A = observer(({history, location, children}) => {

    const serverUrl = location.state.url;
    const data = location.state.response;
    const parsedData = data.COUSR2AO;
    const systemDto = data.systemDto;

    const { COUSR02_COUSR2AStore, SystemStore } = useStore();

    const TRNNAMERef = useRef(COUSR02_COUSR2AStore.TRNNAME);
    const TITLE01Ref = useRef(COUSR02_COUSR2AStore.TITLE01);
    const CURDATERef = useRef(COUSR02_COUSR2AStore.CURDATE);
    const PGMNAMERef = useRef(COUSR02_COUSR2AStore.PGMNAME);
    const TITLE02Ref = useRef(COUSR02_COUSR2AStore.TITLE02);
    const CURTIMERef = useRef(COUSR02_COUSR2AStore.CURTIME);
    const USRIDINRef = useRef(COUSR02_COUSR2AStore.USRIDIN);
    const FNAMERef = useRef(COUSR02_COUSR2AStore.FNAME);
    const LNAMERef = useRef(COUSR02_COUSR2AStore.LNAME);
    const PASSWDRef = useRef(COUSR02_COUSR2AStore.PASSWD);
    const USRTYPERef = useRef(COUSR02_COUSR2AStore.USRTYPE);
    const ERRMSGRef = useRef(COUSR02_COUSR2AStore.ERRMSG);



    const onKeyPressedUSRIDIN = event => {
      COUSR02_COUSR2AStore.setUSRIDIN(event.target.value);
      if(event.target.value.length >= 8.0) {
        FNAMERef.current.focus();
      }
    }
    const onKeyPressedFNAME = event => {
      COUSR02_COUSR2AStore.setFNAME(event.target.value);
      if(event.target.value.length >= 20.0) {
        LNAMERef.current.focus();
      }
    }
    const onKeyPressedLNAME = event => {
      COUSR02_COUSR2AStore.setLNAME(event.target.value);
      if(event.target.value.length >= 20.0) {
        PASSWDRef.current.focus();
      }
    }
    const onKeyPressedPASSWD = event => {
      COUSR02_COUSR2AStore.setPASSWD(event.target.value);
      if(event.target.value.length >= 8.0) {
        USRTYPERef.current.focus();
      }
    }
    const onKeyPressedUSRTYPE = event => {
      COUSR02_COUSR2AStore.setUSRTYPE(event.target.value);
      if(event.target.value.length >= 1.0) {
        USRIDINRef.current.focus();
      }
    }


    const keyEvent = useCallback((event) => {
        if(event.keyCode === 13) {
            COUSR02_COUSR2AStore.request(systemDto, event.keyCode, serverUrl, history, FNAMERef, LNAMERef, PASSWDRef, USRIDINRef, USRTYPERef);
        } else if(event.keyCode >= 112 && event.keyCode <= 123) {
            event.preventDefault();
            COUSR02_COUSR2AStore.request(systemDto, event.keyCode, serverUrl, history, FNAMERef, LNAMERef, PASSWDRef, USRIDINRef, USRTYPERef);
        }
    });

    useEffect (() => {
        document.addEventListener('keydown', keyEvent, false);
        COUSR02_COUSR2AStore.renderStyle(parsedData  ,TRNNAMERef ,TITLE01Ref ,CURDATERef ,PGMNAMERef ,TITLE02Ref ,CURTIMERef ,USRIDINRef ,FNAMERef ,LNAMERef ,PASSWDRef ,USRTYPERef ,ERRMSGRef);
         USRIDINRef.current.focus();
        return () => {
            document.removeEventListener('keydown', keyEvent, false);
        }
    }, []);

    const render = useMemo(() => {
        if(systemDto.immediate === true) {
          COUSR02_COUSR2AStore.simpleRequest(systemDto, 13, serverUrl, history);
        } else {
            if(parsedData !== null) {
              SystemStore.setToggle(true);
              COUSR02_COUSR2AStore.render(parsedData);
            }
        }

    }, [location, systemDto.immediate]);

    const notificationHandleClose = () => {
        SystemStore.setToggle(false);
    };

    return (
        <>
            {render}
            <COUSR02_COUSR2AView
                location = {location}
                onKeyPressedFNAME = { onKeyPressedFNAME }
                onKeyPressedLNAME = { onKeyPressedLNAME }
                onKeyPressedPASSWD = { onKeyPressedPASSWD }
                onKeyPressedUSRIDIN = { onKeyPressedUSRIDIN }
                onKeyPressedUSRTYPE = { onKeyPressedUSRTYPE }
                TRNNAMERef = { TRNNAMERef }
                TITLE01Ref = { TITLE01Ref }
                CURDATERef = { CURDATERef }
                PGMNAMERef = { PGMNAMERef }
                TITLE02Ref = { TITLE02Ref }
                CURTIMERef = { CURTIMERef }
                USRIDINRef = { USRIDINRef }
                FNAMERef = { FNAMERef }
                LNAMERef = { LNAMERef }
                PASSWDRef = { PASSWDRef }
                USRTYPERef = { USRTYPERef }
                ERRMSGRef = { ERRMSGRef }
            />
            {systemDto.notification ? <Notification data = {systemDto.notification} toggle={SystemStore.toggle}
            handleClose = {notificationHandleClose}/> : null}
        </>
    );

});
export default COUSR02_COUSR2A;

