import React, {useCallback, useEffect, useLayoutEffect, useMemo, useRef, useState} from 'react';
import COCRDLI_CCRDLIAView from "./COCRDLI_CCRDLIAView";
import {observer} from "mobx-react";
import useStore from "../store/UseStore";
import Notification from "../runtime/component/notification/Notification";

const COCRDLI_CCRDLIA = observer(({history, location, children}) => {

    const serverUrl = location.state.url;
    const data = location.state.response;
    const parsedData = data.CCRDLIAO;
    const systemDto = data.systemDto;

    const { COCRDLI_CCRDLIAStore, SystemStore } = useStore();

    const TRNNAMERef = useRef(COCRDLI_CCRDLIAStore.TRNNAME);
    const TITLE01Ref = useRef(COCRDLI_CCRDLIAStore.TITLE01);
    const CURDATERef = useRef(COCRDLI_CCRDLIAStore.CURDATE);
    const PGMNAMERef = useRef(COCRDLI_CCRDLIAStore.PGMNAME);
    const TITLE02Ref = useRef(COCRDLI_CCRDLIAStore.TITLE02);
    const CURTIMERef = useRef(COCRDLI_CCRDLIAStore.CURTIME);
    const PAGENORef = useRef(COCRDLI_CCRDLIAStore.PAGENO);
    const ACCTSIDRef = useRef(COCRDLI_CCRDLIAStore.ACCTSID);
    const CARDSIDRef = useRef(COCRDLI_CCRDLIAStore.CARDSID);
    const CRDSEL1Ref = useRef(COCRDLI_CCRDLIAStore.CRDSEL1);
    const ACCTNO1Ref = useRef(COCRDLI_CCRDLIAStore.ACCTNO1);
    const CRDNUM1Ref = useRef(COCRDLI_CCRDLIAStore.CRDNUM1);
    const CRDSTS1Ref = useRef(COCRDLI_CCRDLIAStore.CRDSTS1);
    const CRDSEL2Ref = useRef(COCRDLI_CCRDLIAStore.CRDSEL2);
    const CRDSTP2Ref = useRef(COCRDLI_CCRDLIAStore.CRDSTP2);
    const ACCTNO2Ref = useRef(COCRDLI_CCRDLIAStore.ACCTNO2);
    const CRDNUM2Ref = useRef(COCRDLI_CCRDLIAStore.CRDNUM2);
    const CRDSTS2Ref = useRef(COCRDLI_CCRDLIAStore.CRDSTS2);
    const CRDSEL3Ref = useRef(COCRDLI_CCRDLIAStore.CRDSEL3);
    const CRDSTP3Ref = useRef(COCRDLI_CCRDLIAStore.CRDSTP3);
    const ACCTNO3Ref = useRef(COCRDLI_CCRDLIAStore.ACCTNO3);
    const CRDNUM3Ref = useRef(COCRDLI_CCRDLIAStore.CRDNUM3);
    const CRDSTS3Ref = useRef(COCRDLI_CCRDLIAStore.CRDSTS3);
    const CRDSEL4Ref = useRef(COCRDLI_CCRDLIAStore.CRDSEL4);
    const CRDSTP4Ref = useRef(COCRDLI_CCRDLIAStore.CRDSTP4);
    const ACCTNO4Ref = useRef(COCRDLI_CCRDLIAStore.ACCTNO4);
    const CRDNUM4Ref = useRef(COCRDLI_CCRDLIAStore.CRDNUM4);
    const CRDSTS4Ref = useRef(COCRDLI_CCRDLIAStore.CRDSTS4);
    const CRDSEL5Ref = useRef(COCRDLI_CCRDLIAStore.CRDSEL5);
    const CRDSTP5Ref = useRef(COCRDLI_CCRDLIAStore.CRDSTP5);
    const ACCTNO5Ref = useRef(COCRDLI_CCRDLIAStore.ACCTNO5);
    const CRDNUM5Ref = useRef(COCRDLI_CCRDLIAStore.CRDNUM5);
    const CRDSTS5Ref = useRef(COCRDLI_CCRDLIAStore.CRDSTS5);
    const CRDSEL6Ref = useRef(COCRDLI_CCRDLIAStore.CRDSEL6);
    const CRDSTP6Ref = useRef(COCRDLI_CCRDLIAStore.CRDSTP6);
    const ACCTNO6Ref = useRef(COCRDLI_CCRDLIAStore.ACCTNO6);
    const CRDNUM6Ref = useRef(COCRDLI_CCRDLIAStore.CRDNUM6);
    const CRDSTS6Ref = useRef(COCRDLI_CCRDLIAStore.CRDSTS6);
    const CRDSEL7Ref = useRef(COCRDLI_CCRDLIAStore.CRDSEL7);
    const CRDSTP7Ref = useRef(COCRDLI_CCRDLIAStore.CRDSTP7);
    const ACCTNO7Ref = useRef(COCRDLI_CCRDLIAStore.ACCTNO7);
    const CRDNUM7Ref = useRef(COCRDLI_CCRDLIAStore.CRDNUM7);
    const CRDSTS7Ref = useRef(COCRDLI_CCRDLIAStore.CRDSTS7);
    const INFOMSGRef = useRef(COCRDLI_CCRDLIAStore.INFOMSG);
    const ERRMSGRef = useRef(COCRDLI_CCRDLIAStore.ERRMSG);


    const onKeyPressedCARDSID = event => {
      COCRDLI_CCRDLIAStore.setCARDSID(event.target.value);
    }
    const onKeyPressedCRDSEL1 = event => {
      COCRDLI_CCRDLIAStore.setCRDSEL1(event.target.value);
    }

    const onKeyPressedACCTSID = event => {
      COCRDLI_CCRDLIAStore.setACCTSID(event.target.value);
      if(event.target.value.length >= 11.0) {
        CARDSIDRef.current.focus();
      }
    }
    const onKeyPressedCRDSEL2 = event => {
      COCRDLI_CCRDLIAStore.setCRDSEL2(event.target.value);
      if(event.target.value.length >= 1.0) {
        CRDSEL3Ref.current.focus();
      }
    }
    const onKeyPressedCRDSEL3 = event => {
      COCRDLI_CCRDLIAStore.setCRDSEL3(event.target.value);
      if(event.target.value.length >= 1.0) {
        CRDSEL4Ref.current.focus();
      }
    }
    const onKeyPressedCRDSEL4 = event => {
      COCRDLI_CCRDLIAStore.setCRDSEL4(event.target.value);
      if(event.target.value.length >= 1.0) {
        CRDSEL5Ref.current.focus();
      }
    }
    const onKeyPressedCRDSEL5 = event => {
      COCRDLI_CCRDLIAStore.setCRDSEL5(event.target.value);
      if(event.target.value.length >= 1.0) {
        CRDSEL6Ref.current.focus();
      }
    }
    const onKeyPressedCRDSEL6 = event => {
      COCRDLI_CCRDLIAStore.setCRDSEL6(event.target.value);
      if(event.target.value.length >= 1.0) {
        CRDSEL7Ref.current.focus();
      }
    }
    const onKeyPressedCRDSEL7 = event => {
      COCRDLI_CCRDLIAStore.setCRDSEL7(event.target.value);
      if(event.target.value.length >= 1.0) {
        ACCTSIDRef.current.focus();
      }
    }


    const keyEvent = useCallback((event) => {
        if(event.keyCode === 13) {
            COCRDLI_CCRDLIAStore.request(systemDto, event.keyCode, serverUrl, history, ACCTSIDRef, CARDSIDRef, CRDSEL1Ref, CRDSEL2Ref, CRDSEL3Ref, CRDSEL4Ref, CRDSEL5Ref, CRDSEL6Ref, CRDSEL7Ref);
        } else if(event.keyCode >= 112 && event.keyCode <= 123) {
            event.preventDefault();
            COCRDLI_CCRDLIAStore.request(systemDto, event.keyCode, serverUrl, history, ACCTSIDRef, CARDSIDRef, CRDSEL1Ref, CRDSEL2Ref, CRDSEL3Ref, CRDSEL4Ref, CRDSEL5Ref, CRDSEL6Ref, CRDSEL7Ref);
        }
    });

    useEffect (() => {
        document.addEventListener('keydown', keyEvent, false);
        COCRDLI_CCRDLIAStore.renderStyle(parsedData  ,TRNNAMERef ,TITLE01Ref ,CURDATERef ,PGMNAMERef ,TITLE02Ref ,CURTIMERef ,PAGENORef ,ACCTSIDRef ,CARDSIDRef ,CRDSEL1Ref ,ACCTNO1Ref ,CRDNUM1Ref ,CRDSTS1Ref ,CRDSEL2Ref ,CRDSTP2Ref ,ACCTNO2Ref ,CRDNUM2Ref ,CRDSTS2Ref ,CRDSEL3Ref ,CRDSTP3Ref ,ACCTNO3Ref ,CRDNUM3Ref ,CRDSTS3Ref ,CRDSEL4Ref ,CRDSTP4Ref ,ACCTNO4Ref ,CRDNUM4Ref ,CRDSTS4Ref ,CRDSEL5Ref ,CRDSTP5Ref ,ACCTNO5Ref ,CRDNUM5Ref ,CRDSTS5Ref ,CRDSEL6Ref ,CRDSTP6Ref ,ACCTNO6Ref ,CRDNUM6Ref ,CRDSTS6Ref ,CRDSEL7Ref ,CRDSTP7Ref ,ACCTNO7Ref ,CRDNUM7Ref ,CRDSTS7Ref ,INFOMSGRef ,ERRMSGRef);
         ACCTSIDRef.current.focus();
        return () => {
            document.removeEventListener('keydown', keyEvent, false);
        }
    }, []);

    const render = useMemo(() => {
        if(systemDto.immediate === true) {
          COCRDLI_CCRDLIAStore.simpleRequest(systemDto, 13, serverUrl, history);
        } else {
            if(parsedData !== null) {
              SystemStore.setToggle(true);
              COCRDLI_CCRDLIAStore.render(parsedData);
            }
        }

    }, [location, systemDto.immediate]);

    const notificationHandleClose = () => {
        SystemStore.setToggle(false);
    };

    return (
        <>
            {render}
            <COCRDLI_CCRDLIAView
                location = {location}
                onKeyPressedACCTSID = { onKeyPressedACCTSID }
                onKeyPressedCARDSID = { onKeyPressedCARDSID }
                onKeyPressedCRDSEL1 = { onKeyPressedCRDSEL1 }
                onKeyPressedCRDSEL2 = { onKeyPressedCRDSEL2 }
                onKeyPressedCRDSEL3 = { onKeyPressedCRDSEL3 }
                onKeyPressedCRDSEL4 = { onKeyPressedCRDSEL4 }
                onKeyPressedCRDSEL5 = { onKeyPressedCRDSEL5 }
                onKeyPressedCRDSEL6 = { onKeyPressedCRDSEL6 }
                onKeyPressedCRDSEL7 = { onKeyPressedCRDSEL7 }
                TRNNAMERef = { TRNNAMERef }
                TITLE01Ref = { TITLE01Ref }
                CURDATERef = { CURDATERef }
                PGMNAMERef = { PGMNAMERef }
                TITLE02Ref = { TITLE02Ref }
                CURTIMERef = { CURTIMERef }
                PAGENORef = { PAGENORef }
                ACCTSIDRef = { ACCTSIDRef }
                CARDSIDRef = { CARDSIDRef }
                CRDSEL1Ref = { CRDSEL1Ref }
                ACCTNO1Ref = { ACCTNO1Ref }
                CRDNUM1Ref = { CRDNUM1Ref }
                CRDSTS1Ref = { CRDSTS1Ref }
                CRDSEL2Ref = { CRDSEL2Ref }
                CRDSTP2Ref = { CRDSTP2Ref }
                ACCTNO2Ref = { ACCTNO2Ref }
                CRDNUM2Ref = { CRDNUM2Ref }
                CRDSTS2Ref = { CRDSTS2Ref }
                CRDSEL3Ref = { CRDSEL3Ref }
                CRDSTP3Ref = { CRDSTP3Ref }
                ACCTNO3Ref = { ACCTNO3Ref }
                CRDNUM3Ref = { CRDNUM3Ref }
                CRDSTS3Ref = { CRDSTS3Ref }
                CRDSEL4Ref = { CRDSEL4Ref }
                CRDSTP4Ref = { CRDSTP4Ref }
                ACCTNO4Ref = { ACCTNO4Ref }
                CRDNUM4Ref = { CRDNUM4Ref }
                CRDSTS4Ref = { CRDSTS4Ref }
                CRDSEL5Ref = { CRDSEL5Ref }
                CRDSTP5Ref = { CRDSTP5Ref }
                ACCTNO5Ref = { ACCTNO5Ref }
                CRDNUM5Ref = { CRDNUM5Ref }
                CRDSTS5Ref = { CRDSTS5Ref }
                CRDSEL6Ref = { CRDSEL6Ref }
                CRDSTP6Ref = { CRDSTP6Ref }
                ACCTNO6Ref = { ACCTNO6Ref }
                CRDNUM6Ref = { CRDNUM6Ref }
                CRDSTS6Ref = { CRDSTS6Ref }
                CRDSEL7Ref = { CRDSEL7Ref }
                CRDSTP7Ref = { CRDSTP7Ref }
                ACCTNO7Ref = { ACCTNO7Ref }
                CRDNUM7Ref = { CRDNUM7Ref }
                CRDSTS7Ref = { CRDSTS7Ref }
                INFOMSGRef = { INFOMSGRef }
                ERRMSGRef = { ERRMSGRef }
            />
            {systemDto.notification ? <Notification data = {systemDto.notification} toggle={SystemStore.toggle}
            handleClose = {notificationHandleClose}/> : null}
        </>
    );

});
export default COCRDLI_CCRDLIA;

