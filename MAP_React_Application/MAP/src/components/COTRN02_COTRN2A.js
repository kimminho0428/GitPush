import React, {useCallback, useEffect, useLayoutEffect, useMemo, useRef, useState} from 'react';
import COTRN02_COTRN2AView from "./COTRN02_COTRN2AView";
import {observer} from "mobx-react";
import useStore from "../store/UseStore";
import Notification from "../runtime/component/notification/Notification";

const COTRN02_COTRN2A = observer(({history, location, children}) => {

    const serverUrl = location.state.url;
    const data = location.state.response;
    const parsedData = data.COTRN2AO;
    const systemDto = data.systemDto;

    const { COTRN02_COTRN2AStore, SystemStore } = useStore();

    const TRNNAMERef = useRef(COTRN02_COTRN2AStore.TRNNAME);
    const TITLE01Ref = useRef(COTRN02_COTRN2AStore.TITLE01);
    const CURDATERef = useRef(COTRN02_COTRN2AStore.CURDATE);
    const PGMNAMERef = useRef(COTRN02_COTRN2AStore.PGMNAME);
    const TITLE02Ref = useRef(COTRN02_COTRN2AStore.TITLE02);
    const CURTIMERef = useRef(COTRN02_COTRN2AStore.CURTIME);
    const ACTIDINRef = useRef(COTRN02_COTRN2AStore.ACTIDIN);
    const CARDNINRef = useRef(COTRN02_COTRN2AStore.CARDNIN);
    const TTYPCDRef = useRef(COTRN02_COTRN2AStore.TTYPCD);
    const TCATCDRef = useRef(COTRN02_COTRN2AStore.TCATCD);
    const TRNSRCRef = useRef(COTRN02_COTRN2AStore.TRNSRC);
    const TDESCRef = useRef(COTRN02_COTRN2AStore.TDESC);
    const TRNAMTRef = useRef(COTRN02_COTRN2AStore.TRNAMT);
    const TORIGDTRef = useRef(COTRN02_COTRN2AStore.TORIGDT);
    const TPROCDTRef = useRef(COTRN02_COTRN2AStore.TPROCDT);
    const MIDRef = useRef(COTRN02_COTRN2AStore.MID);
    const MNAMERef = useRef(COTRN02_COTRN2AStore.MNAME);
    const MCITYRef = useRef(COTRN02_COTRN2AStore.MCITY);
    const MZIPRef = useRef(COTRN02_COTRN2AStore.MZIP);
    const CONFIRMRef = useRef(COTRN02_COTRN2AStore.CONFIRM);
    const ERRMSGRef = useRef(COTRN02_COTRN2AStore.ERRMSG);



    const onKeyPressedACTIDIN = event => {
      COTRN02_COTRN2AStore.setACTIDIN(event.target.value);
      if(event.target.value.length >= 11.0) {
        CARDNINRef.current.focus();
      }
    }
    const onKeyPressedCARDNIN = event => {
      COTRN02_COTRN2AStore.setCARDNIN(event.target.value);
      if(event.target.value.length >= 16.0) {
        TTYPCDRef.current.focus();
      }
    }
    const onKeyPressedTTYPCD = event => {
      COTRN02_COTRN2AStore.setTTYPCD(event.target.value);
      if(event.target.value.length >= 2.0) {
        TCATCDRef.current.focus();
      }
    }
    const onKeyPressedTCATCD = event => {
      COTRN02_COTRN2AStore.setTCATCD(event.target.value);
      if(event.target.value.length >= 4.0) {
        TRNSRCRef.current.focus();
      }
    }
    const onKeyPressedTRNSRC = event => {
      COTRN02_COTRN2AStore.setTRNSRC(event.target.value);
      if(event.target.value.length >= 10.0) {
        TDESCRef.current.focus();
      }
    }
    const onKeyPressedTDESC = event => {
      COTRN02_COTRN2AStore.setTDESC(event.target.value);
      if(event.target.value.length >= 60.0) {
        TRNAMTRef.current.focus();
      }
    }
    const onKeyPressedTRNAMT = event => {
      COTRN02_COTRN2AStore.setTRNAMT(event.target.value);
      if(event.target.value.length >= 12.0) {
        TORIGDTRef.current.focus();
      }
    }
    const onKeyPressedTORIGDT = event => {
      COTRN02_COTRN2AStore.setTORIGDT(event.target.value);
      if(event.target.value.length >= 10.0) {
        TPROCDTRef.current.focus();
      }
    }
    const onKeyPressedTPROCDT = event => {
      COTRN02_COTRN2AStore.setTPROCDT(event.target.value);
      if(event.target.value.length >= 10.0) {
        MIDRef.current.focus();
      }
    }
    const onKeyPressedMID = event => {
      COTRN02_COTRN2AStore.setMID(event.target.value);
      if(event.target.value.length >= 9.0) {
        MNAMERef.current.focus();
      }
    }
    const onKeyPressedMNAME = event => {
      COTRN02_COTRN2AStore.setMNAME(event.target.value);
      if(event.target.value.length >= 30.0) {
        MCITYRef.current.focus();
      }
    }
    const onKeyPressedMCITY = event => {
      COTRN02_COTRN2AStore.setMCITY(event.target.value);
      if(event.target.value.length >= 25.0) {
        MZIPRef.current.focus();
      }
    }
    const onKeyPressedMZIP = event => {
      COTRN02_COTRN2AStore.setMZIP(event.target.value);
      if(event.target.value.length >= 10.0) {
        CONFIRMRef.current.focus();
      }
    }
    const onKeyPressedCONFIRM = event => {
      COTRN02_COTRN2AStore.setCONFIRM(event.target.value);
      if(event.target.value.length >= 1.0) {
        ACTIDINRef.current.focus();
      }
    }


    const keyEvent = useCallback((event) => {
        if(event.keyCode === 13) {
            COTRN02_COTRN2AStore.request(systemDto, event.keyCode, serverUrl, history, ACTIDINRef, CARDNINRef, CONFIRMRef, MCITYRef, MIDRef, MNAMERef, MZIPRef, TCATCDRef, TDESCRef, TORIGDTRef, TPROCDTRef, TRNAMTRef, TRNSRCRef, TTYPCDRef);
        } else if(event.keyCode >= 112 && event.keyCode <= 123) {
            event.preventDefault();
            COTRN02_COTRN2AStore.request(systemDto, event.keyCode, serverUrl, history, ACTIDINRef, CARDNINRef, CONFIRMRef, MCITYRef, MIDRef, MNAMERef, MZIPRef, TCATCDRef, TDESCRef, TORIGDTRef, TPROCDTRef, TRNAMTRef, TRNSRCRef, TTYPCDRef);
        }
    });

    useEffect (() => {
        document.addEventListener('keydown', keyEvent, false);
        COTRN02_COTRN2AStore.renderStyle(parsedData  ,TRNNAMERef ,TITLE01Ref ,CURDATERef ,PGMNAMERef ,TITLE02Ref ,CURTIMERef ,ACTIDINRef ,CARDNINRef ,TTYPCDRef ,TCATCDRef ,TRNSRCRef ,TDESCRef ,TRNAMTRef ,TORIGDTRef ,TPROCDTRef ,MIDRef ,MNAMERef ,MCITYRef ,MZIPRef ,CONFIRMRef ,ERRMSGRef);
         ACTIDINRef.current.focus();
        return () => {
            document.removeEventListener('keydown', keyEvent, false);
        }
    }, []);

    const render = useMemo(() => {
        if(systemDto.immediate === true) {
          COTRN02_COTRN2AStore.simpleRequest(systemDto, 13, serverUrl, history);
        } else {
            if(parsedData !== null) {
              SystemStore.setToggle(true);
              COTRN02_COTRN2AStore.render(parsedData);
            }
        }

    }, [location, systemDto.immediate]);

    const notificationHandleClose = () => {
        SystemStore.setToggle(false);
    };

    return (
        <>
            {render}
            <COTRN02_COTRN2AView
                location = {location}
                onKeyPressedACTIDIN = { onKeyPressedACTIDIN }
                onKeyPressedCARDNIN = { onKeyPressedCARDNIN }
                onKeyPressedCONFIRM = { onKeyPressedCONFIRM }
                onKeyPressedMCITY = { onKeyPressedMCITY }
                onKeyPressedMID = { onKeyPressedMID }
                onKeyPressedMNAME = { onKeyPressedMNAME }
                onKeyPressedMZIP = { onKeyPressedMZIP }
                onKeyPressedTCATCD = { onKeyPressedTCATCD }
                onKeyPressedTDESC = { onKeyPressedTDESC }
                onKeyPressedTORIGDT = { onKeyPressedTORIGDT }
                onKeyPressedTPROCDT = { onKeyPressedTPROCDT }
                onKeyPressedTRNAMT = { onKeyPressedTRNAMT }
                onKeyPressedTRNSRC = { onKeyPressedTRNSRC }
                onKeyPressedTTYPCD = { onKeyPressedTTYPCD }
                TRNNAMERef = { TRNNAMERef }
                TITLE01Ref = { TITLE01Ref }
                CURDATERef = { CURDATERef }
                PGMNAMERef = { PGMNAMERef }
                TITLE02Ref = { TITLE02Ref }
                CURTIMERef = { CURTIMERef }
                ACTIDINRef = { ACTIDINRef }
                CARDNINRef = { CARDNINRef }
                TTYPCDRef = { TTYPCDRef }
                TCATCDRef = { TCATCDRef }
                TRNSRCRef = { TRNSRCRef }
                TDESCRef = { TDESCRef }
                TRNAMTRef = { TRNAMTRef }
                TORIGDTRef = { TORIGDTRef }
                TPROCDTRef = { TPROCDTRef }
                MIDRef = { MIDRef }
                MNAMERef = { MNAMERef }
                MCITYRef = { MCITYRef }
                MZIPRef = { MZIPRef }
                CONFIRMRef = { CONFIRMRef }
                ERRMSGRef = { ERRMSGRef }
            />
            {systemDto.notification ? <Notification data = {systemDto.notification} toggle={SystemStore.toggle}
            handleClose = {notificationHandleClose}/> : null}
        </>
    );

});
export default COTRN02_COTRN2A;

