import React, {useCallback, useEffect, useLayoutEffect, useMemo, useRef, useState} from 'react';
import CORPT00_CORPT0AView from "./CORPT00_CORPT0AView";
import {observer} from "mobx-react";
import useStore from "../store/UseStore";
import Notification from "../runtime/component/notification/Notification";

const CORPT00_CORPT0A = observer(({history, location, children}) => {

    const serverUrl = location.state.url;
    const data = location.state.response;
    const parsedData = data.CORPT0AO;
    const systemDto = data.systemDto;

    const { CORPT00_CORPT0AStore, SystemStore } = useStore();

    const TRNNAMERef = useRef(CORPT00_CORPT0AStore.TRNNAME);
    const TITLE01Ref = useRef(CORPT00_CORPT0AStore.TITLE01);
    const CURDATERef = useRef(CORPT00_CORPT0AStore.CURDATE);
    const PGMNAMERef = useRef(CORPT00_CORPT0AStore.PGMNAME);
    const TITLE02Ref = useRef(CORPT00_CORPT0AStore.TITLE02);
    const CURTIMERef = useRef(CORPT00_CORPT0AStore.CURTIME);
    const MONTHLYRef = useRef(CORPT00_CORPT0AStore.MONTHLY);
    const YEARLYRef = useRef(CORPT00_CORPT0AStore.YEARLY);
    const CUSTOMRef = useRef(CORPT00_CORPT0AStore.CUSTOM);
    const SDTMMRef = useRef(CORPT00_CORPT0AStore.SDTMM);
    const SDTDDRef = useRef(CORPT00_CORPT0AStore.SDTDD);
    const SDTYYYYRef = useRef(CORPT00_CORPT0AStore.SDTYYYY);
    const EDTMMRef = useRef(CORPT00_CORPT0AStore.EDTMM);
    const EDTDDRef = useRef(CORPT00_CORPT0AStore.EDTDD);
    const EDTYYYYRef = useRef(CORPT00_CORPT0AStore.EDTYYYY);
    const CONFIRMRef = useRef(CORPT00_CORPT0AStore.CONFIRM);
    const ERRMSGRef = useRef(CORPT00_CORPT0AStore.ERRMSG);



    const onKeyPressedMONTHLY = event => {
      CORPT00_CORPT0AStore.setMONTHLY(event.target.value);
      if(event.target.value.length >= 1.0) {
        YEARLYRef.current.focus();
      }
    }
    const onKeyPressedYEARLY = event => {
      CORPT00_CORPT0AStore.setYEARLY(event.target.value);
      if(event.target.value.length >= 1.0) {
        CUSTOMRef.current.focus();
      }
    }
    const onKeyPressedCUSTOM = event => {
      CORPT00_CORPT0AStore.setCUSTOM(event.target.value);
      if(event.target.value.length >= 1.0) {
        SDTMMRef.current.focus();
      }
    }
    const onKeyPressedSDTMM = event => {
      CORPT00_CORPT0AStore.setSDTMM(event.target.value);
      if(event.target.value.length >= 2.0) {
        SDTDDRef.current.focus();
      }
    }
    const onKeyPressedSDTDD = event => {
      CORPT00_CORPT0AStore.setSDTDD(event.target.value);
      if(event.target.value.length >= 2.0) {
        SDTYYYYRef.current.focus();
      }
    }
    const onKeyPressedSDTYYYY = event => {
      CORPT00_CORPT0AStore.setSDTYYYY(event.target.value);
      if(event.target.value.length >= 4.0) {
        EDTMMRef.current.focus();
      }
    }
    const onKeyPressedEDTMM = event => {
      CORPT00_CORPT0AStore.setEDTMM(event.target.value);
      if(event.target.value.length >= 2.0) {
        EDTDDRef.current.focus();
      }
    }
    const onKeyPressedEDTDD = event => {
      CORPT00_CORPT0AStore.setEDTDD(event.target.value);
      if(event.target.value.length >= 2.0) {
        EDTYYYYRef.current.focus();
      }
    }
    const onKeyPressedEDTYYYY = event => {
      CORPT00_CORPT0AStore.setEDTYYYY(event.target.value);
      if(event.target.value.length >= 4.0) {
        CONFIRMRef.current.focus();
      }
    }
    const onKeyPressedCONFIRM = event => {
      CORPT00_CORPT0AStore.setCONFIRM(event.target.value);
      if(event.target.value.length >= 1.0) {
        MONTHLYRef.current.focus();
      }
    }


    const keyEvent = useCallback((event) => {
        if(event.keyCode === 13) {
            CORPT00_CORPT0AStore.request(systemDto, event.keyCode, serverUrl, history, CONFIRMRef, CUSTOMRef, EDTDDRef, EDTMMRef, EDTYYYYRef, MONTHLYRef, SDTDDRef, SDTMMRef, SDTYYYYRef, YEARLYRef);
        } else if(event.keyCode >= 112 && event.keyCode <= 123) {
            event.preventDefault();
            CORPT00_CORPT0AStore.request(systemDto, event.keyCode, serverUrl, history, CONFIRMRef, CUSTOMRef, EDTDDRef, EDTMMRef, EDTYYYYRef, MONTHLYRef, SDTDDRef, SDTMMRef, SDTYYYYRef, YEARLYRef);
        }
    });

    useEffect (() => {
        document.addEventListener('keydown', keyEvent, false);
        CORPT00_CORPT0AStore.renderStyle(parsedData  ,TRNNAMERef ,TITLE01Ref ,CURDATERef ,PGMNAMERef ,TITLE02Ref ,CURTIMERef ,MONTHLYRef ,YEARLYRef ,CUSTOMRef ,SDTMMRef ,SDTDDRef ,SDTYYYYRef ,EDTMMRef ,EDTDDRef ,EDTYYYYRef ,CONFIRMRef ,ERRMSGRef);
         MONTHLYRef.current.focus();
        return () => {
            document.removeEventListener('keydown', keyEvent, false);
        }
    }, []);

    const render = useMemo(() => {
        if(systemDto.immediate === true) {
          CORPT00_CORPT0AStore.simpleRequest(systemDto, 13, serverUrl, history);
        } else {
            if(parsedData !== null) {
              SystemStore.setToggle(true);
              CORPT00_CORPT0AStore.render(parsedData);
            }
        }

    }, [location, systemDto.immediate]);

    const notificationHandleClose = () => {
        SystemStore.setToggle(false);
    };

    return (
        <>
            {render}
            <CORPT00_CORPT0AView
                location = {location}
                onKeyPressedCONFIRM = { onKeyPressedCONFIRM }
                onKeyPressedCUSTOM = { onKeyPressedCUSTOM }
                onKeyPressedEDTDD = { onKeyPressedEDTDD }
                onKeyPressedEDTMM = { onKeyPressedEDTMM }
                onKeyPressedEDTYYYY = { onKeyPressedEDTYYYY }
                onKeyPressedMONTHLY = { onKeyPressedMONTHLY }
                onKeyPressedSDTDD = { onKeyPressedSDTDD }
                onKeyPressedSDTMM = { onKeyPressedSDTMM }
                onKeyPressedSDTYYYY = { onKeyPressedSDTYYYY }
                onKeyPressedYEARLY = { onKeyPressedYEARLY }
                TRNNAMERef = { TRNNAMERef }
                TITLE01Ref = { TITLE01Ref }
                CURDATERef = { CURDATERef }
                PGMNAMERef = { PGMNAMERef }
                TITLE02Ref = { TITLE02Ref }
                CURTIMERef = { CURTIMERef }
                MONTHLYRef = { MONTHLYRef }
                YEARLYRef = { YEARLYRef }
                CUSTOMRef = { CUSTOMRef }
                SDTMMRef = { SDTMMRef }
                SDTDDRef = { SDTDDRef }
                SDTYYYYRef = { SDTYYYYRef }
                EDTMMRef = { EDTMMRef }
                EDTDDRef = { EDTDDRef }
                EDTYYYYRef = { EDTYYYYRef }
                CONFIRMRef = { CONFIRMRef }
                ERRMSGRef = { ERRMSGRef }
            />
            {systemDto.notification ? <Notification data = {systemDto.notification} toggle={SystemStore.toggle}
            handleClose = {notificationHandleClose}/> : null}
        </>
    );

});
export default CORPT00_CORPT0A;

