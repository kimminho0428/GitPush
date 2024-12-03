import React, {useCallback, useEffect, useLayoutEffect, useMemo, useRef, useState} from 'react';
import COACTVW_CACTVWAView from "./COACTVW_CACTVWAView";
import {observer} from "mobx-react";
import useStore from "../store/UseStore";
import Notification from "../runtime/component/notification/Notification";

const COACTVW_CACTVWA = observer(({history, location, children}) => {

    const serverUrl = location.state.url;
    const data = location.state.response;
    const parsedData = data.CACTVWAO;
    const systemDto = data.systemDto;

    const { COACTVW_CACTVWAStore, SystemStore } = useStore();

    const TRNNAMERef = useRef(COACTVW_CACTVWAStore.TRNNAME);
    const TITLE01Ref = useRef(COACTVW_CACTVWAStore.TITLE01);
    const CURDATERef = useRef(COACTVW_CACTVWAStore.CURDATE);
    const PGMNAMERef = useRef(COACTVW_CACTVWAStore.PGMNAME);
    const TITLE02Ref = useRef(COACTVW_CACTVWAStore.TITLE02);
    const CURTIMERef = useRef(COACTVW_CACTVWAStore.CURTIME);
    const ACCTSIDRef = useRef(COACTVW_CACTVWAStore.ACCTSID);
    const ACSTTUSRef = useRef(COACTVW_CACTVWAStore.ACSTTUS);
    const ADTOPENRef = useRef(COACTVW_CACTVWAStore.ADTOPEN);
    const ACRDLIMRef = useRef(COACTVW_CACTVWAStore.ACRDLIM);
    const AEXPDTRef = useRef(COACTVW_CACTVWAStore.AEXPDT);
    const ACSHLIMRef = useRef(COACTVW_CACTVWAStore.ACSHLIM);
    const AREISDTRef = useRef(COACTVW_CACTVWAStore.AREISDT);
    const ACURBALRef = useRef(COACTVW_CACTVWAStore.ACURBAL);
    const ACRCYCRRef = useRef(COACTVW_CACTVWAStore.ACRCYCR);
    const AADDGRPRef = useRef(COACTVW_CACTVWAStore.AADDGRP);
    const ACRCYDBRef = useRef(COACTVW_CACTVWAStore.ACRCYDB);
    const ACSTNUMRef = useRef(COACTVW_CACTVWAStore.ACSTNUM);
    const ACSTSSNRef = useRef(COACTVW_CACTVWAStore.ACSTSSN);
    const ACSTDOBRef = useRef(COACTVW_CACTVWAStore.ACSTDOB);
    const ACSTFCORef = useRef(COACTVW_CACTVWAStore.ACSTFCO);
    const ACSFNAMRef = useRef(COACTVW_CACTVWAStore.ACSFNAM);
    const ACSMNAMRef = useRef(COACTVW_CACTVWAStore.ACSMNAM);
    const ACSLNAMRef = useRef(COACTVW_CACTVWAStore.ACSLNAM);
    const ACSADL1Ref = useRef(COACTVW_CACTVWAStore.ACSADL1);
    const ACSSTTERef = useRef(COACTVW_CACTVWAStore.ACSSTTE);
    const ACSADL2Ref = useRef(COACTVW_CACTVWAStore.ACSADL2);
    const ACSZIPCRef = useRef(COACTVW_CACTVWAStore.ACSZIPC);
    const ACSCITYRef = useRef(COACTVW_CACTVWAStore.ACSCITY);
    const ACSCTRYRef = useRef(COACTVW_CACTVWAStore.ACSCTRY);
    const ACSPHN1Ref = useRef(COACTVW_CACTVWAStore.ACSPHN1);
    const ACSGOVTRef = useRef(COACTVW_CACTVWAStore.ACSGOVT);
    const ACSPHN2Ref = useRef(COACTVW_CACTVWAStore.ACSPHN2);
    const ACSEFTCRef = useRef(COACTVW_CACTVWAStore.ACSEFTC);
    const ACSPFLGRef = useRef(COACTVW_CACTVWAStore.ACSPFLG);
    const INFOMSGRef = useRef(COACTVW_CACTVWAStore.INFOMSG);
    const ERRMSGRef = useRef(COACTVW_CACTVWAStore.ERRMSG);



    const onKeyPressedACCTSID = event => {
      COACTVW_CACTVWAStore.setACCTSID(event.target.value);
      if(event.target.value.length >= 11.0) {
        ACCTSIDRef.current.focus();
      }
    }


    const keyEvent = useCallback((event) => {
        if(event.keyCode === 13) {
            COACTVW_CACTVWAStore.request(systemDto, event.keyCode, serverUrl, history, ACCTSIDRef);
        } else if(event.keyCode >= 112 && event.keyCode <= 123) {
            event.preventDefault();
            COACTVW_CACTVWAStore.request(systemDto, event.keyCode, serverUrl, history, ACCTSIDRef);
        }
    });

    useEffect (() => {
        document.addEventListener('keydown', keyEvent, false);
        COACTVW_CACTVWAStore.renderStyle(parsedData  ,TRNNAMERef ,TITLE01Ref ,CURDATERef ,PGMNAMERef ,TITLE02Ref ,CURTIMERef ,ACCTSIDRef ,ACSTTUSRef ,ADTOPENRef ,ACRDLIMRef ,AEXPDTRef ,ACSHLIMRef ,AREISDTRef ,ACURBALRef ,ACRCYCRRef ,AADDGRPRef ,ACRCYDBRef ,ACSTNUMRef ,ACSTSSNRef ,ACSTDOBRef ,ACSTFCORef ,ACSFNAMRef ,ACSMNAMRef ,ACSLNAMRef ,ACSADL1Ref ,ACSSTTERef ,ACSADL2Ref ,ACSZIPCRef ,ACSCITYRef ,ACSCTRYRef ,ACSPHN1Ref ,ACSGOVTRef ,ACSPHN2Ref ,ACSEFTCRef ,ACSPFLGRef ,INFOMSGRef ,ERRMSGRef);
         ACCTSIDRef.current.focus();
        return () => {
            document.removeEventListener('keydown', keyEvent, false);
        }
    }, []);

    const render = useMemo(() => {
        if(systemDto.immediate === true) {
          COACTVW_CACTVWAStore.simpleRequest(systemDto, 13, serverUrl, history);
        } else {
            if(parsedData !== null) {
              SystemStore.setToggle(true);
              COACTVW_CACTVWAStore.render(parsedData);
            }
        }

    }, [location, systemDto.immediate]);

    const notificationHandleClose = () => {
        SystemStore.setToggle(false);
    };

    return (
        <>
            {render}
            <COACTVW_CACTVWAView
                location = {location}
                onKeyPressedACCTSID = { onKeyPressedACCTSID }
                TRNNAMERef = { TRNNAMERef }
                TITLE01Ref = { TITLE01Ref }
                CURDATERef = { CURDATERef }
                PGMNAMERef = { PGMNAMERef }
                TITLE02Ref = { TITLE02Ref }
                CURTIMERef = { CURTIMERef }
                ACCTSIDRef = { ACCTSIDRef }
                ACSTTUSRef = { ACSTTUSRef }
                ADTOPENRef = { ADTOPENRef }
                ACRDLIMRef = { ACRDLIMRef }
                AEXPDTRef = { AEXPDTRef }
                ACSHLIMRef = { ACSHLIMRef }
                AREISDTRef = { AREISDTRef }
                ACURBALRef = { ACURBALRef }
                ACRCYCRRef = { ACRCYCRRef }
                AADDGRPRef = { AADDGRPRef }
                ACRCYDBRef = { ACRCYDBRef }
                ACSTNUMRef = { ACSTNUMRef }
                ACSTSSNRef = { ACSTSSNRef }
                ACSTDOBRef = { ACSTDOBRef }
                ACSTFCORef = { ACSTFCORef }
                ACSFNAMRef = { ACSFNAMRef }
                ACSMNAMRef = { ACSMNAMRef }
                ACSLNAMRef = { ACSLNAMRef }
                ACSADL1Ref = { ACSADL1Ref }
                ACSSTTERef = { ACSSTTERef }
                ACSADL2Ref = { ACSADL2Ref }
                ACSZIPCRef = { ACSZIPCRef }
                ACSCITYRef = { ACSCITYRef }
                ACSCTRYRef = { ACSCTRYRef }
                ACSPHN1Ref = { ACSPHN1Ref }
                ACSGOVTRef = { ACSGOVTRef }
                ACSPHN2Ref = { ACSPHN2Ref }
                ACSEFTCRef = { ACSEFTCRef }
                ACSPFLGRef = { ACSPFLGRef }
                INFOMSGRef = { INFOMSGRef }
                ERRMSGRef = { ERRMSGRef }
            />
            {systemDto.notification ? <Notification data = {systemDto.notification} toggle={SystemStore.toggle}
            handleClose = {notificationHandleClose}/> : null}
        </>
    );

});
export default COACTVW_CACTVWA;

