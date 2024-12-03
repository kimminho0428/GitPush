import React, {useCallback, useEffect, useLayoutEffect, useMemo, useRef, useState} from 'react';
import COSGN00_COSGN0AView from "./COSGN00_COSGN0AView";
import {observer} from "mobx-react";
import useStore from "../store/UseStore";
import Notification from "../runtime/component/notification/Notification";

const COSGN00_COSGN0A = observer(({history, location, children}) => {

    const serverUrl = location.state.url;
    const data = location.state.response;
    const parsedData = data.COSGN0AO;
    const systemDto = data.systemDto;

    const { COSGN00_COSGN0AStore, SystemStore } = useStore();

    const TRNNAMERef = useRef(COSGN00_COSGN0AStore.TRNNAME);
    const TITLE01Ref = useRef(COSGN00_COSGN0AStore.TITLE01);
    const CURDATERef = useRef(COSGN00_COSGN0AStore.CURDATE);
    const PGMNAMERef = useRef(COSGN00_COSGN0AStore.PGMNAME);
    const TITLE02Ref = useRef(COSGN00_COSGN0AStore.TITLE02);
    const CURTIMERef = useRef(COSGN00_COSGN0AStore.CURTIME);
    const APPLIDRef = useRef(COSGN00_COSGN0AStore.APPLID);
    const SYSIDRef = useRef(COSGN00_COSGN0AStore.SYSID);
    const USERIDRef = useRef(COSGN00_COSGN0AStore.USERID);
    const PASSWDRef = useRef(COSGN00_COSGN0AStore.PASSWD);
    const ERRMSGRef = useRef(COSGN00_COSGN0AStore.ERRMSG);

    const _field477Ref = useRef('');


    const onKeyPressedUSERID = event => {
      COSGN00_COSGN0AStore.setUSERID(event.target.value);
      if(event.target.value.length >= 8.0) {
        PASSWDRef.current.focus();
      }
    }
    const onKeyPressedPASSWD = event => {
      COSGN00_COSGN0AStore.setPASSWD(event.target.value);
      if(event.target.value.length >= 8.0) {
        _field477Ref.current.focus();
      }
    }

    const onKeyPressed_field477 = event => {
      if(event.target.value.length >= 1.0) {
        USERIDRef.current.focus();
      }
    }

    const keyEvent = useCallback((event) => {
        if(event.keyCode === 13) {
            COSGN00_COSGN0AStore.request(systemDto, event.keyCode, serverUrl, history, PASSWDRef, USERIDRef);
        } else if(event.keyCode >= 112 && event.keyCode <= 123) {
            event.preventDefault();
            COSGN00_COSGN0AStore.request(systemDto, event.keyCode, serverUrl, history, PASSWDRef, USERIDRef);
        }
    });

    useEffect (() => {
        document.addEventListener('keydown', keyEvent, false);
        COSGN00_COSGN0AStore.renderStyle(parsedData  ,TRNNAMERef ,TITLE01Ref ,CURDATERef ,PGMNAMERef ,TITLE02Ref ,CURTIMERef ,APPLIDRef ,SYSIDRef ,USERIDRef ,PASSWDRef ,ERRMSGRef);
         USERIDRef.current.focus();
        return () => {
            document.removeEventListener('keydown', keyEvent, false);
        }
    }, []);

    const render = useMemo(() => {
        if(systemDto.immediate === true) {
          COSGN00_COSGN0AStore.simpleRequest(systemDto, 13, serverUrl, history);
        } else {
            if(parsedData !== null) {
              SystemStore.setToggle(true);
              COSGN00_COSGN0AStore.render(parsedData);
            }
        }

    }, [location, systemDto.immediate]);

    const notificationHandleClose = () => {
        SystemStore.setToggle(false);
    };

    return (
        <>
            {render}
            <COSGN00_COSGN0AView
                location = {location}
                onKeyPressedPASSWD = { onKeyPressedPASSWD }
                onKeyPressedUSERID = { onKeyPressedUSERID }
                TRNNAMERef = { TRNNAMERef }
                TITLE01Ref = { TITLE01Ref }
                CURDATERef = { CURDATERef }
                PGMNAMERef = { PGMNAMERef }
                TITLE02Ref = { TITLE02Ref }
                CURTIMERef = { CURTIMERef }
                APPLIDRef = { APPLIDRef }
                SYSIDRef = { SYSIDRef }
                USERIDRef = { USERIDRef }
                PASSWDRef = { PASSWDRef }
                ERRMSGRef = { ERRMSGRef }
            />
            {systemDto.notification ? <Notification data = {systemDto.notification} toggle={SystemStore.toggle}
            handleClose = {notificationHandleClose}/> : null}
        </>
    );

});
export default COSGN00_COSGN0A;

