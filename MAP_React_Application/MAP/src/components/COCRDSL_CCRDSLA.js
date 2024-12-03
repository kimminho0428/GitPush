import React, {useCallback, useEffect, useLayoutEffect, useMemo, useRef, useState} from 'react';
import COCRDSL_CCRDSLAView from "./COCRDSL_CCRDSLAView";
import {observer} from "mobx-react";
import useStore from "../store/UseStore";
import Notification from "../runtime/component/notification/Notification";

const COCRDSL_CCRDSLA = observer(({history, location, children}) => {

    const serverUrl = location.state.url;
    const data = location.state.response;
    const parsedData = data.CCRDSLAO;
    const systemDto = data.systemDto;

    const { COCRDSL_CCRDSLAStore, SystemStore } = useStore();

    const TRNNAMERef = useRef(COCRDSL_CCRDSLAStore.TRNNAME);
    const TITLE01Ref = useRef(COCRDSL_CCRDSLAStore.TITLE01);
    const CURDATERef = useRef(COCRDSL_CCRDSLAStore.CURDATE);
    const PGMNAMERef = useRef(COCRDSL_CCRDSLAStore.PGMNAME);
    const TITLE02Ref = useRef(COCRDSL_CCRDSLAStore.TITLE02);
    const CURTIMERef = useRef(COCRDSL_CCRDSLAStore.CURTIME);
    const ACCTSIDRef = useRef(COCRDSL_CCRDSLAStore.ACCTSID);
    const CARDSIDRef = useRef(COCRDSL_CCRDSLAStore.CARDSID);
    const CRDNAMERef = useRef(COCRDSL_CCRDSLAStore.CRDNAME);
    const CRDSTCDRef = useRef(COCRDSL_CCRDSLAStore.CRDSTCD);
    const EXPMONRef = useRef(COCRDSL_CCRDSLAStore.EXPMON);
    const EXPYEARRef = useRef(COCRDSL_CCRDSLAStore.EXPYEAR);
    const INFOMSGRef = useRef(COCRDSL_CCRDSLAStore.INFOMSG);
    const ERRMSGRef = useRef(COCRDSL_CCRDSLAStore.ERRMSG);
    const FKEYSRef = useRef(COCRDSL_CCRDSLAStore.FKEYS);



    const onKeyPressedACCTSID = event => {
      COCRDSL_CCRDSLAStore.setACCTSID(event.target.value);
      if(event.target.value.length >= 11.0) {
        CARDSIDRef.current.focus();
      }
    }
    const onKeyPressedCARDSID = event => {
      COCRDSL_CCRDSLAStore.setCARDSID(event.target.value);
      if(event.target.value.length >= 16.0) {
        ACCTSIDRef.current.focus();
      }
    }


    const keyEvent = useCallback((event) => {
        if(event.keyCode === 13) {
            COCRDSL_CCRDSLAStore.request(systemDto, event.keyCode, serverUrl, history, ACCTSIDRef, CARDSIDRef);
        } else if(event.keyCode >= 112 && event.keyCode <= 123) {
            event.preventDefault();
            COCRDSL_CCRDSLAStore.request(systemDto, event.keyCode, serverUrl, history, ACCTSIDRef, CARDSIDRef);
        }
    });

    useEffect (() => {
        document.addEventListener('keydown', keyEvent, false);
        COCRDSL_CCRDSLAStore.renderStyle(parsedData  ,TRNNAMERef ,TITLE01Ref ,CURDATERef ,PGMNAMERef ,TITLE02Ref ,CURTIMERef ,ACCTSIDRef ,CARDSIDRef ,CRDNAMERef ,CRDSTCDRef ,EXPMONRef ,EXPYEARRef ,INFOMSGRef ,ERRMSGRef ,FKEYSRef);
         ACCTSIDRef.current.focus();
        return () => {
            document.removeEventListener('keydown', keyEvent, false);
        }
    }, []);

    const render = useMemo(() => {
        if(systemDto.immediate === true) {
          COCRDSL_CCRDSLAStore.simpleRequest(systemDto, 13, serverUrl, history);
        } else {
            if(parsedData !== null) {
              SystemStore.setToggle(true);
              COCRDSL_CCRDSLAStore.render(parsedData);
            }
        }

    }, [location, systemDto.immediate]);

    const notificationHandleClose = () => {
        SystemStore.setToggle(false);
    };

    return (
        <>
            {render}
            <COCRDSL_CCRDSLAView
                location = {location}
                onKeyPressedACCTSID = { onKeyPressedACCTSID }
                onKeyPressedCARDSID = { onKeyPressedCARDSID }
                TRNNAMERef = { TRNNAMERef }
                TITLE01Ref = { TITLE01Ref }
                CURDATERef = { CURDATERef }
                PGMNAMERef = { PGMNAMERef }
                TITLE02Ref = { TITLE02Ref }
                CURTIMERef = { CURTIMERef }
                ACCTSIDRef = { ACCTSIDRef }
                CARDSIDRef = { CARDSIDRef }
                CRDNAMERef = { CRDNAMERef }
                CRDSTCDRef = { CRDSTCDRef }
                EXPMONRef = { EXPMONRef }
                EXPYEARRef = { EXPYEARRef }
                INFOMSGRef = { INFOMSGRef }
                ERRMSGRef = { ERRMSGRef }
                FKEYSRef = { FKEYSRef }
            />
            {systemDto.notification ? <Notification data = {systemDto.notification} toggle={SystemStore.toggle}
            handleClose = {notificationHandleClose}/> : null}
        </>
    );

});
export default COCRDSL_CCRDSLA;

