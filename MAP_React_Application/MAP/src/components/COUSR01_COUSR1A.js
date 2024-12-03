import React, {useCallback, useEffect, useLayoutEffect, useMemo, useRef, useState} from 'react';
import COUSR01_COUSR1AView from "./COUSR01_COUSR1AView";
import {observer} from "mobx-react";
import useStore from "../store/UseStore";
import Notification from "../runtime/component/notification/Notification";

const COUSR01_COUSR1A = observer(({history, location, children}) => {

    const serverUrl = location.state.url;
    const data = location.state.response;
    const parsedData = data.COUSR1AO;
    const systemDto = data.systemDto;

    const { COUSR01_COUSR1AStore, SystemStore } = useStore();

    const TRNNAMERef = useRef(COUSR01_COUSR1AStore.TRNNAME);
    const TITLE01Ref = useRef(COUSR01_COUSR1AStore.TITLE01);
    const CURDATERef = useRef(COUSR01_COUSR1AStore.CURDATE);
    const PGMNAMERef = useRef(COUSR01_COUSR1AStore.PGMNAME);
    const TITLE02Ref = useRef(COUSR01_COUSR1AStore.TITLE02);
    const CURTIMERef = useRef(COUSR01_COUSR1AStore.CURTIME);
    const FNAMERef = useRef(COUSR01_COUSR1AStore.FNAME);
    const LNAMERef = useRef(COUSR01_COUSR1AStore.LNAME);
    const USERIDRef = useRef(COUSR01_COUSR1AStore.USERID);
    const PASSWDRef = useRef(COUSR01_COUSR1AStore.PASSWD);
    const USRTYPERef = useRef(COUSR01_COUSR1AStore.USRTYPE);
    const ERRMSGRef = useRef(COUSR01_COUSR1AStore.ERRMSG);



    const onKeyPressedFNAME = event => {
      COUSR01_COUSR1AStore.setFNAME(event.target.value);
      if(event.target.value.length >= 20.0) {
        LNAMERef.current.focus();
      }
    }
    const onKeyPressedLNAME = event => {
      COUSR01_COUSR1AStore.setLNAME(event.target.value);
      if(event.target.value.length >= 20.0) {
        USERIDRef.current.focus();
      }
    }
    const onKeyPressedUSERID = event => {
      COUSR01_COUSR1AStore.setUSERID(event.target.value);
      if(event.target.value.length >= 8.0) {
        PASSWDRef.current.focus();
      }
    }
    const onKeyPressedPASSWD = event => {
      COUSR01_COUSR1AStore.setPASSWD(event.target.value);
      if(event.target.value.length >= 8.0) {
        USRTYPERef.current.focus();
      }
    }
    const onKeyPressedUSRTYPE = event => {
      COUSR01_COUSR1AStore.setUSRTYPE(event.target.value);
      if(event.target.value.length >= 1.0) {
        FNAMERef.current.focus();
      }
    }


    const keyEvent = useCallback((event) => {
        if(event.keyCode === 13) {
            COUSR01_COUSR1AStore.request(systemDto, event.keyCode, serverUrl, history, FNAMERef, LNAMERef, PASSWDRef, USERIDRef, USRTYPERef);
        } else if(event.keyCode >= 112 && event.keyCode <= 123) {
            event.preventDefault();
            COUSR01_COUSR1AStore.request(systemDto, event.keyCode, serverUrl, history, FNAMERef, LNAMERef, PASSWDRef, USERIDRef, USRTYPERef);
        }
    });

    useEffect (() => {
        document.addEventListener('keydown', keyEvent, false);
        COUSR01_COUSR1AStore.renderStyle(parsedData  ,TRNNAMERef ,TITLE01Ref ,CURDATERef ,PGMNAMERef ,TITLE02Ref ,CURTIMERef ,FNAMERef ,LNAMERef ,USERIDRef ,PASSWDRef ,USRTYPERef ,ERRMSGRef);
         FNAMERef.current.focus();
        return () => {
            document.removeEventListener('keydown', keyEvent, false);
        }
    }, []);

    const render = useMemo(() => {
        if(systemDto.immediate === true) {
          COUSR01_COUSR1AStore.simpleRequest(systemDto, 13, serverUrl, history);
        } else {
            if(parsedData !== null) {
              SystemStore.setToggle(true);
              COUSR01_COUSR1AStore.render(parsedData);
            }
        }

    }, [location, systemDto.immediate]);

    const notificationHandleClose = () => {
        SystemStore.setToggle(false);
    };

    return (
        <>
            {render}
            <COUSR01_COUSR1AView
                location = {location}
                onKeyPressedFNAME = { onKeyPressedFNAME }
                onKeyPressedLNAME = { onKeyPressedLNAME }
                onKeyPressedPASSWD = { onKeyPressedPASSWD }
                onKeyPressedUSERID = { onKeyPressedUSERID }
                onKeyPressedUSRTYPE = { onKeyPressedUSRTYPE }
                TRNNAMERef = { TRNNAMERef }
                TITLE01Ref = { TITLE01Ref }
                CURDATERef = { CURDATERef }
                PGMNAMERef = { PGMNAMERef }
                TITLE02Ref = { TITLE02Ref }
                CURTIMERef = { CURTIMERef }
                FNAMERef = { FNAMERef }
                LNAMERef = { LNAMERef }
                USERIDRef = { USERIDRef }
                PASSWDRef = { PASSWDRef }
                USRTYPERef = { USRTYPERef }
                ERRMSGRef = { ERRMSGRef }
            />
            {systemDto.notification ? <Notification data = {systemDto.notification} toggle={SystemStore.toggle}
            handleClose = {notificationHandleClose}/> : null}
        </>
    );

});
export default COUSR01_COUSR1A;

