import React, {useCallback, useEffect, useLayoutEffect, useMemo, useRef, useState} from 'react';
import COUSR00_COUSR0AView from "./COUSR00_COUSR0AView";
import {observer} from "mobx-react";
import useStore from "../store/UseStore";
import Notification from "../runtime/component/notification/Notification";

const COUSR00_COUSR0A = observer(({history, location, children}) => {

    const serverUrl = location.state.url;
    const data = location.state.response;
    const parsedData = data.COUSR0AO;
    const systemDto = data.systemDto;

    const { COUSR00_COUSR0AStore, SystemStore } = useStore();

    const TRNNAMERef = useRef(COUSR00_COUSR0AStore.TRNNAME);
    const TITLE01Ref = useRef(COUSR00_COUSR0AStore.TITLE01);
    const CURDATERef = useRef(COUSR00_COUSR0AStore.CURDATE);
    const PGMNAMERef = useRef(COUSR00_COUSR0AStore.PGMNAME);
    const TITLE02Ref = useRef(COUSR00_COUSR0AStore.TITLE02);
    const CURTIMERef = useRef(COUSR00_COUSR0AStore.CURTIME);
    const PAGENUMRef = useRef(COUSR00_COUSR0AStore.PAGENUM);
    const USRIDINRef = useRef(COUSR00_COUSR0AStore.USRIDIN);
    const SEL0001Ref = useRef(COUSR00_COUSR0AStore.SEL0001);
    const USRID01Ref = useRef(COUSR00_COUSR0AStore.USRID01);
    const FNAME01Ref = useRef(COUSR00_COUSR0AStore.FNAME01);
    const LNAME01Ref = useRef(COUSR00_COUSR0AStore.LNAME01);
    const UTYPE01Ref = useRef(COUSR00_COUSR0AStore.UTYPE01);
    const SEL0002Ref = useRef(COUSR00_COUSR0AStore.SEL0002);
    const USRID02Ref = useRef(COUSR00_COUSR0AStore.USRID02);
    const FNAME02Ref = useRef(COUSR00_COUSR0AStore.FNAME02);
    const LNAME02Ref = useRef(COUSR00_COUSR0AStore.LNAME02);
    const UTYPE02Ref = useRef(COUSR00_COUSR0AStore.UTYPE02);
    const SEL0003Ref = useRef(COUSR00_COUSR0AStore.SEL0003);
    const USRID03Ref = useRef(COUSR00_COUSR0AStore.USRID03);
    const FNAME03Ref = useRef(COUSR00_COUSR0AStore.FNAME03);
    const LNAME03Ref = useRef(COUSR00_COUSR0AStore.LNAME03);
    const UTYPE03Ref = useRef(COUSR00_COUSR0AStore.UTYPE03);
    const SEL0004Ref = useRef(COUSR00_COUSR0AStore.SEL0004);
    const USRID04Ref = useRef(COUSR00_COUSR0AStore.USRID04);
    const FNAME04Ref = useRef(COUSR00_COUSR0AStore.FNAME04);
    const LNAME04Ref = useRef(COUSR00_COUSR0AStore.LNAME04);
    const UTYPE04Ref = useRef(COUSR00_COUSR0AStore.UTYPE04);
    const SEL0005Ref = useRef(COUSR00_COUSR0AStore.SEL0005);
    const USRID05Ref = useRef(COUSR00_COUSR0AStore.USRID05);
    const FNAME05Ref = useRef(COUSR00_COUSR0AStore.FNAME05);
    const LNAME05Ref = useRef(COUSR00_COUSR0AStore.LNAME05);
    const UTYPE05Ref = useRef(COUSR00_COUSR0AStore.UTYPE05);
    const SEL0006Ref = useRef(COUSR00_COUSR0AStore.SEL0006);
    const USRID06Ref = useRef(COUSR00_COUSR0AStore.USRID06);
    const FNAME06Ref = useRef(COUSR00_COUSR0AStore.FNAME06);
    const LNAME06Ref = useRef(COUSR00_COUSR0AStore.LNAME06);
    const UTYPE06Ref = useRef(COUSR00_COUSR0AStore.UTYPE06);
    const SEL0007Ref = useRef(COUSR00_COUSR0AStore.SEL0007);
    const USRID07Ref = useRef(COUSR00_COUSR0AStore.USRID07);
    const FNAME07Ref = useRef(COUSR00_COUSR0AStore.FNAME07);
    const LNAME07Ref = useRef(COUSR00_COUSR0AStore.LNAME07);
    const UTYPE07Ref = useRef(COUSR00_COUSR0AStore.UTYPE07);
    const SEL0008Ref = useRef(COUSR00_COUSR0AStore.SEL0008);
    const USRID08Ref = useRef(COUSR00_COUSR0AStore.USRID08);
    const FNAME08Ref = useRef(COUSR00_COUSR0AStore.FNAME08);
    const LNAME08Ref = useRef(COUSR00_COUSR0AStore.LNAME08);
    const UTYPE08Ref = useRef(COUSR00_COUSR0AStore.UTYPE08);
    const SEL0009Ref = useRef(COUSR00_COUSR0AStore.SEL0009);
    const USRID09Ref = useRef(COUSR00_COUSR0AStore.USRID09);
    const FNAME09Ref = useRef(COUSR00_COUSR0AStore.FNAME09);
    const LNAME09Ref = useRef(COUSR00_COUSR0AStore.LNAME09);
    const UTYPE09Ref = useRef(COUSR00_COUSR0AStore.UTYPE09);
    const SEL0010Ref = useRef(COUSR00_COUSR0AStore.SEL0010);
    const USRID10Ref = useRef(COUSR00_COUSR0AStore.USRID10);
    const FNAME10Ref = useRef(COUSR00_COUSR0AStore.FNAME10);
    const LNAME10Ref = useRef(COUSR00_COUSR0AStore.LNAME10);
    const UTYPE10Ref = useRef(COUSR00_COUSR0AStore.UTYPE10);
    const ERRMSGRef = useRef(COUSR00_COUSR0AStore.ERRMSG);



    const onKeyPressedUSRIDIN = event => {
      COUSR00_COUSR0AStore.setUSRIDIN(event.target.value);
      if(event.target.value.length >= 8.0) {
        SEL0001Ref.current.focus();
      }
    }
    const onKeyPressedSEL0001 = event => {
      COUSR00_COUSR0AStore.setSEL0001(event.target.value);
      if(event.target.value.length >= 1.0) {
        SEL0002Ref.current.focus();
      }
    }
    const onKeyPressedSEL0002 = event => {
      COUSR00_COUSR0AStore.setSEL0002(event.target.value);
      if(event.target.value.length >= 1.0) {
        SEL0003Ref.current.focus();
      }
    }
    const onKeyPressedSEL0003 = event => {
      COUSR00_COUSR0AStore.setSEL0003(event.target.value);
      if(event.target.value.length >= 1.0) {
        SEL0004Ref.current.focus();
      }
    }
    const onKeyPressedSEL0004 = event => {
      COUSR00_COUSR0AStore.setSEL0004(event.target.value);
      if(event.target.value.length >= 1.0) {
        SEL0005Ref.current.focus();
      }
    }
    const onKeyPressedSEL0005 = event => {
      COUSR00_COUSR0AStore.setSEL0005(event.target.value);
      if(event.target.value.length >= 1.0) {
        SEL0006Ref.current.focus();
      }
    }
    const onKeyPressedSEL0006 = event => {
      COUSR00_COUSR0AStore.setSEL0006(event.target.value);
      if(event.target.value.length >= 1.0) {
        SEL0007Ref.current.focus();
      }
    }
    const onKeyPressedSEL0007 = event => {
      COUSR00_COUSR0AStore.setSEL0007(event.target.value);
      if(event.target.value.length >= 1.0) {
        SEL0008Ref.current.focus();
      }
    }
    const onKeyPressedSEL0008 = event => {
      COUSR00_COUSR0AStore.setSEL0008(event.target.value);
      if(event.target.value.length >= 1.0) {
        SEL0009Ref.current.focus();
      }
    }
    const onKeyPressedSEL0009 = event => {
      COUSR00_COUSR0AStore.setSEL0009(event.target.value);
      if(event.target.value.length >= 1.0) {
        SEL0010Ref.current.focus();
      }
    }
    const onKeyPressedSEL0010 = event => {
      COUSR00_COUSR0AStore.setSEL0010(event.target.value);
      if(event.target.value.length >= 1.0) {
        USRIDINRef.current.focus();
      }
    }


    const keyEvent = useCallback((event) => {
        if(event.keyCode === 13) {
            COUSR00_COUSR0AStore.request(systemDto, event.keyCode, serverUrl, history, SEL0001Ref, SEL0002Ref, SEL0003Ref, SEL0004Ref, SEL0005Ref, SEL0006Ref, SEL0007Ref, SEL0008Ref, SEL0009Ref, SEL0010Ref, USRIDINRef);
        } else if(event.keyCode >= 112 && event.keyCode <= 123) {
            event.preventDefault();
            COUSR00_COUSR0AStore.request(systemDto, event.keyCode, serverUrl, history, SEL0001Ref, SEL0002Ref, SEL0003Ref, SEL0004Ref, SEL0005Ref, SEL0006Ref, SEL0007Ref, SEL0008Ref, SEL0009Ref, SEL0010Ref, USRIDINRef);
        }
    });

    useEffect (() => {
        document.addEventListener('keydown', keyEvent, false);
        COUSR00_COUSR0AStore.renderStyle(parsedData  ,TRNNAMERef ,TITLE01Ref ,CURDATERef ,PGMNAMERef ,TITLE02Ref ,CURTIMERef ,PAGENUMRef ,USRIDINRef ,SEL0001Ref ,USRID01Ref ,FNAME01Ref ,LNAME01Ref ,UTYPE01Ref ,SEL0002Ref ,USRID02Ref ,FNAME02Ref ,LNAME02Ref ,UTYPE02Ref ,SEL0003Ref ,USRID03Ref ,FNAME03Ref ,LNAME03Ref ,UTYPE03Ref ,SEL0004Ref ,USRID04Ref ,FNAME04Ref ,LNAME04Ref ,UTYPE04Ref ,SEL0005Ref ,USRID05Ref ,FNAME05Ref ,LNAME05Ref ,UTYPE05Ref ,SEL0006Ref ,USRID06Ref ,FNAME06Ref ,LNAME06Ref ,UTYPE06Ref ,SEL0007Ref ,USRID07Ref ,FNAME07Ref ,LNAME07Ref ,UTYPE07Ref ,SEL0008Ref ,USRID08Ref ,FNAME08Ref ,LNAME08Ref ,UTYPE08Ref ,SEL0009Ref ,USRID09Ref ,FNAME09Ref ,LNAME09Ref ,UTYPE09Ref ,SEL0010Ref ,USRID10Ref ,FNAME10Ref ,LNAME10Ref ,UTYPE10Ref ,ERRMSGRef);
         USRIDINRef.current.focus();
        return () => {
            document.removeEventListener('keydown', keyEvent, false);
        }
    }, []);

    const render = useMemo(() => {
        if(systemDto.immediate === true) {
          COUSR00_COUSR0AStore.simpleRequest(systemDto, 13, serverUrl, history);
        } else {
            if(parsedData !== null) {
              SystemStore.setToggle(true);
              COUSR00_COUSR0AStore.render(parsedData);
            }
        }

    }, [location, systemDto.immediate]);

    const notificationHandleClose = () => {
        SystemStore.setToggle(false);
    };

    return (
        <>
            {render}
            <COUSR00_COUSR0AView
                location = {location}
                onKeyPressedSEL0001 = { onKeyPressedSEL0001 }
                onKeyPressedSEL0002 = { onKeyPressedSEL0002 }
                onKeyPressedSEL0003 = { onKeyPressedSEL0003 }
                onKeyPressedSEL0004 = { onKeyPressedSEL0004 }
                onKeyPressedSEL0005 = { onKeyPressedSEL0005 }
                onKeyPressedSEL0006 = { onKeyPressedSEL0006 }
                onKeyPressedSEL0007 = { onKeyPressedSEL0007 }
                onKeyPressedSEL0008 = { onKeyPressedSEL0008 }
                onKeyPressedSEL0009 = { onKeyPressedSEL0009 }
                onKeyPressedSEL0010 = { onKeyPressedSEL0010 }
                onKeyPressedUSRIDIN = { onKeyPressedUSRIDIN }
                TRNNAMERef = { TRNNAMERef }
                TITLE01Ref = { TITLE01Ref }
                CURDATERef = { CURDATERef }
                PGMNAMERef = { PGMNAMERef }
                TITLE02Ref = { TITLE02Ref }
                CURTIMERef = { CURTIMERef }
                PAGENUMRef = { PAGENUMRef }
                USRIDINRef = { USRIDINRef }
                SEL0001Ref = { SEL0001Ref }
                USRID01Ref = { USRID01Ref }
                FNAME01Ref = { FNAME01Ref }
                LNAME01Ref = { LNAME01Ref }
                UTYPE01Ref = { UTYPE01Ref }
                SEL0002Ref = { SEL0002Ref }
                USRID02Ref = { USRID02Ref }
                FNAME02Ref = { FNAME02Ref }
                LNAME02Ref = { LNAME02Ref }
                UTYPE02Ref = { UTYPE02Ref }
                SEL0003Ref = { SEL0003Ref }
                USRID03Ref = { USRID03Ref }
                FNAME03Ref = { FNAME03Ref }
                LNAME03Ref = { LNAME03Ref }
                UTYPE03Ref = { UTYPE03Ref }
                SEL0004Ref = { SEL0004Ref }
                USRID04Ref = { USRID04Ref }
                FNAME04Ref = { FNAME04Ref }
                LNAME04Ref = { LNAME04Ref }
                UTYPE04Ref = { UTYPE04Ref }
                SEL0005Ref = { SEL0005Ref }
                USRID05Ref = { USRID05Ref }
                FNAME05Ref = { FNAME05Ref }
                LNAME05Ref = { LNAME05Ref }
                UTYPE05Ref = { UTYPE05Ref }
                SEL0006Ref = { SEL0006Ref }
                USRID06Ref = { USRID06Ref }
                FNAME06Ref = { FNAME06Ref }
                LNAME06Ref = { LNAME06Ref }
                UTYPE06Ref = { UTYPE06Ref }
                SEL0007Ref = { SEL0007Ref }
                USRID07Ref = { USRID07Ref }
                FNAME07Ref = { FNAME07Ref }
                LNAME07Ref = { LNAME07Ref }
                UTYPE07Ref = { UTYPE07Ref }
                SEL0008Ref = { SEL0008Ref }
                USRID08Ref = { USRID08Ref }
                FNAME08Ref = { FNAME08Ref }
                LNAME08Ref = { LNAME08Ref }
                UTYPE08Ref = { UTYPE08Ref }
                SEL0009Ref = { SEL0009Ref }
                USRID09Ref = { USRID09Ref }
                FNAME09Ref = { FNAME09Ref }
                LNAME09Ref = { LNAME09Ref }
                UTYPE09Ref = { UTYPE09Ref }
                SEL0010Ref = { SEL0010Ref }
                USRID10Ref = { USRID10Ref }
                FNAME10Ref = { FNAME10Ref }
                LNAME10Ref = { LNAME10Ref }
                UTYPE10Ref = { UTYPE10Ref }
                ERRMSGRef = { ERRMSGRef }
            />
            {systemDto.notification ? <Notification data = {systemDto.notification} toggle={SystemStore.toggle}
            handleClose = {notificationHandleClose}/> : null}
        </>
    );

});
export default COUSR00_COUSR0A;

