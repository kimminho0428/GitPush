import React, {useCallback, useEffect, useLayoutEffect, useMemo, useRef, useState} from 'react';
import COCRDUP_CCRDUPAView from "./COCRDUP_CCRDUPAView";
import {observer} from "mobx-react";
import useStore from "../store/UseStore";
import Notification from "../runtime/component/notification/Notification";

const COCRDUP_CCRDUPA = observer(({history, location, children}) => {

    const serverUrl = location.state.url;
    const data = location.state.response;
    const parsedData = data.CCRDUPAO;
    const systemDto = data.systemDto;

    const { COCRDUP_CCRDUPAStore, SystemStore } = useStore();

    const TRNNAMERef = useRef(COCRDUP_CCRDUPAStore.TRNNAME);
    const TITLE01Ref = useRef(COCRDUP_CCRDUPAStore.TITLE01);
    const CURDATERef = useRef(COCRDUP_CCRDUPAStore.CURDATE);
    const PGMNAMERef = useRef(COCRDUP_CCRDUPAStore.PGMNAME);
    const TITLE02Ref = useRef(COCRDUP_CCRDUPAStore.TITLE02);
    const CURTIMERef = useRef(COCRDUP_CCRDUPAStore.CURTIME);
    const ACCTSIDRef = useRef(COCRDUP_CCRDUPAStore.ACCTSID);
    const CARDSIDRef = useRef(COCRDUP_CCRDUPAStore.CARDSID);
    const CRDNAMERef = useRef(COCRDUP_CCRDUPAStore.CRDNAME);
    const CRDSTCDRef = useRef(COCRDUP_CCRDUPAStore.CRDSTCD);
    const EXPMONRef = useRef(COCRDUP_CCRDUPAStore.EXPMON);
    const EXPYEARRef = useRef(COCRDUP_CCRDUPAStore.EXPYEAR);
    const EXPDAYRef = useRef(COCRDUP_CCRDUPAStore.EXPDAY);
    const INFOMSGRef = useRef(COCRDUP_CCRDUPAStore.INFOMSG);
    const ERRMSGRef = useRef(COCRDUP_CCRDUPAStore.ERRMSG);
    const FKEYSRef = useRef(COCRDUP_CCRDUPAStore.FKEYS);
    const FKEYSCRef = useRef(COCRDUP_CCRDUPAStore.FKEYSC);


    const onKeyPressedCARDSID = event => {
      COCRDUP_CCRDUPAStore.setCARDSID(event.target.value);
    }
    const onKeyPressedCRDNAME = event => {
      COCRDUP_CCRDUPAStore.setCRDNAME(event.target.value);
    }
    const onKeyPressedCRDSTCD = event => {
      COCRDUP_CCRDUPAStore.setCRDSTCD(event.target.value);
    }
    const onKeyPressedEXPMON = event => {
      COCRDUP_CCRDUPAStore.setEXPMON(event.target.value);
    }

    const onKeyPressedACCTSID = event => {
      COCRDUP_CCRDUPAStore.setACCTSID(event.target.value);
      if(event.target.value.length >= 11.0) {
        CARDSIDRef.current.focus();
      }
    }
    const onKeyPressedEXPYEAR = event => {
      COCRDUP_CCRDUPAStore.setEXPYEAR(event.target.value);
      if(event.target.value.length >= 4.0) {
        ACCTSIDRef.current.focus();
      }
    }


    const keyEvent = useCallback((event) => {
        if(event.keyCode === 13) {
            COCRDUP_CCRDUPAStore.request(systemDto, event.keyCode, serverUrl, history, ACCTSIDRef, CARDSIDRef, CRDNAMERef, CRDSTCDRef, EXPMONRef, EXPYEARRef);
        } else if(event.keyCode >= 112 && event.keyCode <= 123) {
            event.preventDefault();
            COCRDUP_CCRDUPAStore.request(systemDto, event.keyCode, serverUrl, history, ACCTSIDRef, CARDSIDRef, CRDNAMERef, CRDSTCDRef, EXPMONRef, EXPYEARRef);
        }
    });

    useEffect (() => {
        document.addEventListener('keydown', keyEvent, false);
        COCRDUP_CCRDUPAStore.renderStyle(parsedData  ,TRNNAMERef ,TITLE01Ref ,CURDATERef ,PGMNAMERef ,TITLE02Ref ,CURTIMERef ,ACCTSIDRef ,CARDSIDRef ,CRDNAMERef ,CRDSTCDRef ,EXPMONRef ,EXPYEARRef ,EXPDAYRef ,INFOMSGRef ,ERRMSGRef ,FKEYSRef ,FKEYSCRef);
         ACCTSIDRef.current.focus();
        return () => {
            document.removeEventListener('keydown', keyEvent, false);
        }
    }, []);

    const render = useMemo(() => {
        if(systemDto.immediate === true) {
          COCRDUP_CCRDUPAStore.simpleRequest(systemDto, 13, serverUrl, history);
        } else {
            if(parsedData !== null) {
              SystemStore.setToggle(true);
              COCRDUP_CCRDUPAStore.render(parsedData);
            }
        }

    }, [location, systemDto.immediate]);

    const notificationHandleClose = () => {
        SystemStore.setToggle(false);
    };

    return (
        <>
            {render}
            <COCRDUP_CCRDUPAView
                location = {location}
                onKeyPressedACCTSID = { onKeyPressedACCTSID }
                onKeyPressedCARDSID = { onKeyPressedCARDSID }
                onKeyPressedCRDNAME = { onKeyPressedCRDNAME }
                onKeyPressedCRDSTCD = { onKeyPressedCRDSTCD }
                onKeyPressedEXPMON = { onKeyPressedEXPMON }
                onKeyPressedEXPYEAR = { onKeyPressedEXPYEAR }
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
                EXPDAYRef = { EXPDAYRef }
                INFOMSGRef = { INFOMSGRef }
                ERRMSGRef = { ERRMSGRef }
                FKEYSRef = { FKEYSRef }
                FKEYSCRef = { FKEYSCRef }
            />
            {systemDto.notification ? <Notification data = {systemDto.notification} toggle={SystemStore.toggle}
            handleClose = {notificationHandleClose}/> : null}
        </>
    );

});
export default COCRDUP_CCRDUPA;

