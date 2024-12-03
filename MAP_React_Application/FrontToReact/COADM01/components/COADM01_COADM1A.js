import React, {useCallback, useEffect, useLayoutEffect, useMemo, useRef, useState} from 'react';
import COADM01_COADM1AView from "./COADM01_COADM1AView";
import {observer} from "mobx-react";
import useStore from "../store/UseStore";
import Notification from "../runtime/component/notification/Notification";

const COADM01_COADM1A = observer(({history, location, children}) => {

    const serverUrl = location.state.url;
    const data = location.state.response;
    const parsedData = data.COADM1AO;
    const systemDto = data.systemDto;

    const { COADM01_COADM1AStore, SystemStore } = useStore();

    const TRNNAMERef = useRef(COADM01_COADM1AStore.TRNNAME);
    const TITLE01Ref = useRef(COADM01_COADM1AStore.TITLE01);
    const CURDATERef = useRef(COADM01_COADM1AStore.CURDATE);
    const PGMNAMERef = useRef(COADM01_COADM1AStore.PGMNAME);
    const TITLE02Ref = useRef(COADM01_COADM1AStore.TITLE02);
    const CURTIMERef = useRef(COADM01_COADM1AStore.CURTIME);
    const OPTN001Ref = useRef(COADM01_COADM1AStore.OPTN001);
    const OPTN002Ref = useRef(COADM01_COADM1AStore.OPTN002);
    const OPTN003Ref = useRef(COADM01_COADM1AStore.OPTN003);
    const OPTN004Ref = useRef(COADM01_COADM1AStore.OPTN004);
    const OPTN005Ref = useRef(COADM01_COADM1AStore.OPTN005);
    const OPTN006Ref = useRef(COADM01_COADM1AStore.OPTN006);
    const OPTN007Ref = useRef(COADM01_COADM1AStore.OPTN007);
    const OPTN008Ref = useRef(COADM01_COADM1AStore.OPTN008);
    const OPTN009Ref = useRef(COADM01_COADM1AStore.OPTN009);
    const OPTN010Ref = useRef(COADM01_COADM1AStore.OPTN010);
    const OPTN011Ref = useRef(COADM01_COADM1AStore.OPTN011);
    const OPTN012Ref = useRef(COADM01_COADM1AStore.OPTN012);
    const OPTIONRef = useRef(COADM01_COADM1AStore.OPTION);
    const ERRMSGRef = useRef(COADM01_COADM1AStore.ERRMSG);



    const onKeyPressedOPTION = event => {
      COADM01_COADM1AStore.setOPTION(event.target.value);
      if(event.target.value.length >= 2.0) {
        OPTIONRef.current.focus();
      }
    }


    const keyEvent = useCallback((event) => {
        if(event.keyCode === 13) {
            COADM01_COADM1AStore.request(systemDto, event.keyCode, serverUrl, history, OPTIONRef);
        } else if(event.keyCode >= 112 && event.keyCode <= 123) {
            event.preventDefault();
            COADM01_COADM1AStore.request(systemDto, event.keyCode, serverUrl, history, OPTIONRef);
        }
    });

    useEffect (() => {
        document.addEventListener('keydown', keyEvent, false);
        COADM01_COADM1AStore.renderStyle(parsedData  ,TRNNAMERef ,TITLE01Ref ,CURDATERef ,PGMNAMERef ,TITLE02Ref ,CURTIMERef ,OPTN001Ref ,OPTN002Ref ,OPTN003Ref ,OPTN004Ref ,OPTN005Ref ,OPTN006Ref ,OPTN007Ref ,OPTN008Ref ,OPTN009Ref ,OPTN010Ref ,OPTN011Ref ,OPTN012Ref ,OPTIONRef ,ERRMSGRef);
         OPTIONRef.current.focus();
        return () => {
            document.removeEventListener('keydown', keyEvent, false);
        }
    }, []);

    const render = useMemo(() => {
        if(systemDto.immediate === true) {
          COADM01_COADM1AStore.simpleRequest(systemDto, 13, serverUrl, history);
        } else {
            if(parsedData !== null) {
              SystemStore.setToggle(true);
              COADM01_COADM1AStore.render(parsedData);
            }
        }

    }, [location, systemDto.immediate]);

    const notificationHandleClose = () => {
        SystemStore.setToggle(false);
    };

    return (
        <>
            {render}
            <COADM01_COADM1AView
                location = {location}
                onKeyPressedOPTION = { onKeyPressedOPTION }
                TRNNAMERef = { TRNNAMERef }
                TITLE01Ref = { TITLE01Ref }
                CURDATERef = { CURDATERef }
                PGMNAMERef = { PGMNAMERef }
                TITLE02Ref = { TITLE02Ref }
                CURTIMERef = { CURTIMERef }
                OPTN001Ref = { OPTN001Ref }
                OPTN002Ref = { OPTN002Ref }
                OPTN003Ref = { OPTN003Ref }
                OPTN004Ref = { OPTN004Ref }
                OPTN005Ref = { OPTN005Ref }
                OPTN006Ref = { OPTN006Ref }
                OPTN007Ref = { OPTN007Ref }
                OPTN008Ref = { OPTN008Ref }
                OPTN009Ref = { OPTN009Ref }
                OPTN010Ref = { OPTN010Ref }
                OPTN011Ref = { OPTN011Ref }
                OPTN012Ref = { OPTN012Ref }
                OPTIONRef = { OPTIONRef }
                ERRMSGRef = { ERRMSGRef }
            />
            {systemDto.notification ? <Notification data = {systemDto.notification} toggle={SystemStore.toggle}
            handleClose = {notificationHandleClose}/> : null}
        </>
    );

});
export default COADM01_COADM1A;

