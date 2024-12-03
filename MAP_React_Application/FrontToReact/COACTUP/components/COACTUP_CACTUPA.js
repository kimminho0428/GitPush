import React, {useCallback, useEffect, useLayoutEffect, useMemo, useRef, useState} from 'react';
import COACTUP_CACTUPAView from "./COACTUP_CACTUPAView";
import {observer} from "mobx-react";
import useStore from "../store/UseStore";
import Notification from "../runtime/component/notification/Notification";

const COACTUP_CACTUPA = observer(({history, location, children}) => {

    const serverUrl = location.state.url;
    const data = location.state.response;
    const parsedData = data.CACTUPAO;
    const systemDto = data.systemDto;

    const { COACTUP_CACTUPAStore, SystemStore } = useStore();

    const TRNNAMERef = useRef(COACTUP_CACTUPAStore.TRNNAME);
    const TITLE01Ref = useRef(COACTUP_CACTUPAStore.TITLE01);
    const CURDATERef = useRef(COACTUP_CACTUPAStore.CURDATE);
    const PGMNAMERef = useRef(COACTUP_CACTUPAStore.PGMNAME);
    const TITLE02Ref = useRef(COACTUP_CACTUPAStore.TITLE02);
    const CURTIMERef = useRef(COACTUP_CACTUPAStore.CURTIME);
    const ACCTSIDRef = useRef(COACTUP_CACTUPAStore.ACCTSID);
    const ACSTTUSRef = useRef(COACTUP_CACTUPAStore.ACSTTUS);
    const OPNYEARRef = useRef(COACTUP_CACTUPAStore.OPNYEAR);
    const OPNMONRef = useRef(COACTUP_CACTUPAStore.OPNMON);
    const OPNDAYRef = useRef(COACTUP_CACTUPAStore.OPNDAY);
    const ACRDLIMRef = useRef(COACTUP_CACTUPAStore.ACRDLIM);
    const EXPYEARRef = useRef(COACTUP_CACTUPAStore.EXPYEAR);
    const EXPMONRef = useRef(COACTUP_CACTUPAStore.EXPMON);
    const EXPDAYRef = useRef(COACTUP_CACTUPAStore.EXPDAY);
    const ACSHLIMRef = useRef(COACTUP_CACTUPAStore.ACSHLIM);
    const RISYEARRef = useRef(COACTUP_CACTUPAStore.RISYEAR);
    const RISMONRef = useRef(COACTUP_CACTUPAStore.RISMON);
    const RISDAYRef = useRef(COACTUP_CACTUPAStore.RISDAY);
    const ACURBALRef = useRef(COACTUP_CACTUPAStore.ACURBAL);
    const ACRCYCRRef = useRef(COACTUP_CACTUPAStore.ACRCYCR);
    const AADDGRPRef = useRef(COACTUP_CACTUPAStore.AADDGRP);
    const ACRCYDBRef = useRef(COACTUP_CACTUPAStore.ACRCYDB);
    const ACSTNUMRef = useRef(COACTUP_CACTUPAStore.ACSTNUM);
    const ACTSSN1Ref = useRef(COACTUP_CACTUPAStore.ACTSSN1);
    const ACTSSN2Ref = useRef(COACTUP_CACTUPAStore.ACTSSN2);
    const ACTSSN3Ref = useRef(COACTUP_CACTUPAStore.ACTSSN3);
    const DOBYEARRef = useRef(COACTUP_CACTUPAStore.DOBYEAR);
    const DOBMONRef = useRef(COACTUP_CACTUPAStore.DOBMON);
    const DOBDAYRef = useRef(COACTUP_CACTUPAStore.DOBDAY);
    const ACSTFCORef = useRef(COACTUP_CACTUPAStore.ACSTFCO);
    const ACSFNAMRef = useRef(COACTUP_CACTUPAStore.ACSFNAM);
    const ACSMNAMRef = useRef(COACTUP_CACTUPAStore.ACSMNAM);
    const ACSLNAMRef = useRef(COACTUP_CACTUPAStore.ACSLNAM);
    const ACSADL1Ref = useRef(COACTUP_CACTUPAStore.ACSADL1);
    const ACSSTTERef = useRef(COACTUP_CACTUPAStore.ACSSTTE);
    const ACSADL2Ref = useRef(COACTUP_CACTUPAStore.ACSADL2);
    const ACSZIPCRef = useRef(COACTUP_CACTUPAStore.ACSZIPC);
    const ACSCITYRef = useRef(COACTUP_CACTUPAStore.ACSCITY);
    const ACSCTRYRef = useRef(COACTUP_CACTUPAStore.ACSCTRY);
    const ACSPH1ARef = useRef(COACTUP_CACTUPAStore.ACSPH1A);
    const ACSPH1BRef = useRef(COACTUP_CACTUPAStore.ACSPH1B);
    const ACSPH1CRef = useRef(COACTUP_CACTUPAStore.ACSPH1C);
    const ACSGOVTRef = useRef(COACTUP_CACTUPAStore.ACSGOVT);
    const ACSPH2ARef = useRef(COACTUP_CACTUPAStore.ACSPH2A);
    const ACSPH2BRef = useRef(COACTUP_CACTUPAStore.ACSPH2B);
    const ACSPH2CRef = useRef(COACTUP_CACTUPAStore.ACSPH2C);
    const ACSEFTCRef = useRef(COACTUP_CACTUPAStore.ACSEFTC);
    const ACSPFLGRef = useRef(COACTUP_CACTUPAStore.ACSPFLG);
    const INFOMSGRef = useRef(COACTUP_CACTUPAStore.INFOMSG);
    const ERRMSGRef = useRef(COACTUP_CACTUPAStore.ERRMSG);
    const FKEYSRef = useRef(COACTUP_CACTUPAStore.FKEYS);
    const FKEY05Ref = useRef(COACTUP_CACTUPAStore.FKEY05);
    const FKEY12Ref = useRef(COACTUP_CACTUPAStore.FKEY12);


    const onKeyPressedACSTTUS = event => {
      COACTUP_CACTUPAStore.setACSTTUS(event.target.value);
    }
    const onKeyPressedOPNYEAR = event => {
      COACTUP_CACTUPAStore.setOPNYEAR(event.target.value);
    }
    const onKeyPressedOPNMON = event => {
      COACTUP_CACTUPAStore.setOPNMON(event.target.value);
    }
    const onKeyPressedACRDLIM = event => {
      COACTUP_CACTUPAStore.setACRDLIM(event.target.value);
    }
    const onKeyPressedEXPYEAR = event => {
      COACTUP_CACTUPAStore.setEXPYEAR(event.target.value);
    }
    const onKeyPressedEXPMON = event => {
      COACTUP_CACTUPAStore.setEXPMON(event.target.value);
    }
    const onKeyPressedACSHLIM = event => {
      COACTUP_CACTUPAStore.setACSHLIM(event.target.value);
    }
    const onKeyPressedRISYEAR = event => {
      COACTUP_CACTUPAStore.setRISYEAR(event.target.value);
    }
    const onKeyPressedRISMON = event => {
      COACTUP_CACTUPAStore.setRISMON(event.target.value);
    }
    const onKeyPressedACRCYCR = event => {
      COACTUP_CACTUPAStore.setACRCYCR(event.target.value);
    }
    const onKeyPressedACRCYDB = event => {
      COACTUP_CACTUPAStore.setACRCYDB(event.target.value);
    }
    const onKeyPressedACSTNUM = event => {
      COACTUP_CACTUPAStore.setACSTNUM(event.target.value);
    }
    const onKeyPressedACTSSN1 = event => {
      COACTUP_CACTUPAStore.setACTSSN1(event.target.value);
    }
    const onKeyPressedACTSSN2 = event => {
      COACTUP_CACTUPAStore.setACTSSN2(event.target.value);
    }
    const onKeyPressedACTSSN3 = event => {
      COACTUP_CACTUPAStore.setACTSSN3(event.target.value);
    }
    const onKeyPressedDOBYEAR = event => {
      COACTUP_CACTUPAStore.setDOBYEAR(event.target.value);
    }
    const onKeyPressedDOBMON = event => {
      COACTUP_CACTUPAStore.setDOBMON(event.target.value);
    }
    const onKeyPressedDOBDAY = event => {
      COACTUP_CACTUPAStore.setDOBDAY(event.target.value);
    }
    const onKeyPressedACSTFCO = event => {
      COACTUP_CACTUPAStore.setACSTFCO(event.target.value);
    }
    const onKeyPressedACSFNAM = event => {
      COACTUP_CACTUPAStore.setACSFNAM(event.target.value);
    }
    const onKeyPressedACSMNAM = event => {
      COACTUP_CACTUPAStore.setACSMNAM(event.target.value);
    }
    const onKeyPressedACSLNAM = event => {
      COACTUP_CACTUPAStore.setACSLNAM(event.target.value);
    }
    const onKeyPressedACSADL1 = event => {
      COACTUP_CACTUPAStore.setACSADL1(event.target.value);
    }
    const onKeyPressedACSSTTE = event => {
      COACTUP_CACTUPAStore.setACSSTTE(event.target.value);
    }
    const onKeyPressedACSADL2 = event => {
      COACTUP_CACTUPAStore.setACSADL2(event.target.value);
    }
    const onKeyPressedACSZIPC = event => {
      COACTUP_CACTUPAStore.setACSZIPC(event.target.value);
    }
    const onKeyPressedACSCITY = event => {
      COACTUP_CACTUPAStore.setACSCITY(event.target.value);
    }
    const onKeyPressedACSCTRY = event => {
      COACTUP_CACTUPAStore.setACSCTRY(event.target.value);
    }
    const onKeyPressedACSPH1A = event => {
      COACTUP_CACTUPAStore.setACSPH1A(event.target.value);
    }
    const onKeyPressedACSPH1B = event => {
      COACTUP_CACTUPAStore.setACSPH1B(event.target.value);
    }
    const onKeyPressedACSPH1C = event => {
      COACTUP_CACTUPAStore.setACSPH1C(event.target.value);
    }
    const onKeyPressedACSGOVT = event => {
      COACTUP_CACTUPAStore.setACSGOVT(event.target.value);
    }
    const onKeyPressedACSPH2A = event => {
      COACTUP_CACTUPAStore.setACSPH2A(event.target.value);
    }
    const onKeyPressedACSPH2B = event => {
      COACTUP_CACTUPAStore.setACSPH2B(event.target.value);
    }
    const onKeyPressedACSPH2C = event => {
      COACTUP_CACTUPAStore.setACSPH2C(event.target.value);
    }
    const onKeyPressedACSEFTC = event => {
      COACTUP_CACTUPAStore.setACSEFTC(event.target.value);
    }

    const onKeyPressedACCTSID = event => {
      COACTUP_CACTUPAStore.setACCTSID(event.target.value);
      if(event.target.value.length >= 11.0) {
        ACSTTUSRef.current.focus();
      }
    }
    const onKeyPressedOPNDAY = event => {
      COACTUP_CACTUPAStore.setOPNDAY(event.target.value);
      if(event.target.value.length >= 2.0) {
        ACRDLIMRef.current.focus();
      }
    }
    const onKeyPressedEXPDAY = event => {
      COACTUP_CACTUPAStore.setEXPDAY(event.target.value);
      if(event.target.value.length >= 2.0) {
        ACSHLIMRef.current.focus();
      }
    }
    const onKeyPressedRISDAY = event => {
      COACTUP_CACTUPAStore.setRISDAY(event.target.value);
      if(event.target.value.length >= 2.0) {
        ACURBALRef.current.focus();
      }
    }
    const onKeyPressedACURBAL = event => {
      COACTUP_CACTUPAStore.setACURBAL(event.target.value);
      if(event.target.value.length >= 15.0) {
        ACRCYCRRef.current.focus();
      }
    }
    const onKeyPressedAADDGRP = event => {
      COACTUP_CACTUPAStore.setAADDGRP(event.target.value);
      if(event.target.value.length >= 10.0) {
        ACRCYDBRef.current.focus();
      }
    }
    const onKeyPressedACSPFLG = event => {
      COACTUP_CACTUPAStore.setACSPFLG(event.target.value);
      if(event.target.value.length >= 1.0) {
        ACCTSIDRef.current.focus();
      }
    }


    const keyEvent = useCallback((event) => {
        if(event.keyCode === 13) {
            COACTUP_CACTUPAStore.request(systemDto, event.keyCode, serverUrl, history, AADDGRPRef, ACCTSIDRef, ACRCYCRRef, ACRCYDBRef, ACRDLIMRef, ACSADL1Ref, ACSADL2Ref, ACSCITYRef, ACSCTRYRef, ACSEFTCRef, ACSFNAMRef, ACSGOVTRef, ACSHLIMRef, ACSLNAMRef, ACSMNAMRef, ACSPFLGRef, ACSPH1ARef, ACSPH1BRef, ACSPH1CRef, ACSPH2ARef, ACSPH2BRef, ACSPH2CRef, ACSSTTERef, ACSTFCORef, ACSTNUMRef, ACSTTUSRef, ACSZIPCRef, ACTSSN1Ref, ACTSSN2Ref, ACTSSN3Ref, ACURBALRef, DOBDAYRef, DOBMONRef, DOBYEARRef, EXPDAYRef, EXPMONRef, EXPYEARRef, OPNDAYRef, OPNMONRef, OPNYEARRef, RISDAYRef, RISMONRef, RISYEARRef);
        } else if(event.keyCode >= 112 && event.keyCode <= 123) {
            event.preventDefault();
            COACTUP_CACTUPAStore.request(systemDto, event.keyCode, serverUrl, history, AADDGRPRef, ACCTSIDRef, ACRCYCRRef, ACRCYDBRef, ACRDLIMRef, ACSADL1Ref, ACSADL2Ref, ACSCITYRef, ACSCTRYRef, ACSEFTCRef, ACSFNAMRef, ACSGOVTRef, ACSHLIMRef, ACSLNAMRef, ACSMNAMRef, ACSPFLGRef, ACSPH1ARef, ACSPH1BRef, ACSPH1CRef, ACSPH2ARef, ACSPH2BRef, ACSPH2CRef, ACSSTTERef, ACSTFCORef, ACSTNUMRef, ACSTTUSRef, ACSZIPCRef, ACTSSN1Ref, ACTSSN2Ref, ACTSSN3Ref, ACURBALRef, DOBDAYRef, DOBMONRef, DOBYEARRef, EXPDAYRef, EXPMONRef, EXPYEARRef, OPNDAYRef, OPNMONRef, OPNYEARRef, RISDAYRef, RISMONRef, RISYEARRef);
        }
    });

    useEffect (() => {
        document.addEventListener('keydown', keyEvent, false);
        COACTUP_CACTUPAStore.renderStyle(parsedData  ,TRNNAMERef ,TITLE01Ref ,CURDATERef ,PGMNAMERef ,TITLE02Ref ,CURTIMERef ,ACCTSIDRef ,ACSTTUSRef ,OPNYEARRef ,OPNMONRef ,OPNDAYRef ,ACRDLIMRef ,EXPYEARRef ,EXPMONRef ,EXPDAYRef ,ACSHLIMRef ,RISYEARRef ,RISMONRef ,RISDAYRef ,ACURBALRef ,ACRCYCRRef ,AADDGRPRef ,ACRCYDBRef ,ACSTNUMRef ,ACTSSN1Ref ,ACTSSN2Ref ,ACTSSN3Ref ,DOBYEARRef ,DOBMONRef ,DOBDAYRef ,ACSTFCORef ,ACSFNAMRef ,ACSMNAMRef ,ACSLNAMRef ,ACSADL1Ref ,ACSSTTERef ,ACSADL2Ref ,ACSZIPCRef ,ACSCITYRef ,ACSCTRYRef ,ACSPH1ARef ,ACSPH1BRef ,ACSPH1CRef ,ACSGOVTRef ,ACSPH2ARef ,ACSPH2BRef ,ACSPH2CRef ,ACSEFTCRef ,ACSPFLGRef ,INFOMSGRef ,ERRMSGRef ,FKEYSRef ,FKEY05Ref ,FKEY12Ref);
         ACCTSIDRef.current.focus();
        return () => {
            document.removeEventListener('keydown', keyEvent, false);
        }
    }, []);

    const render = useMemo(() => {
        if(systemDto.immediate === true) {
          COACTUP_CACTUPAStore.simpleRequest(systemDto, 13, serverUrl, history);
        } else {
            if(parsedData !== null) {
              SystemStore.setToggle(true);
              COACTUP_CACTUPAStore.render(parsedData);
            }
        }

    }, [location, systemDto.immediate]);

    const notificationHandleClose = () => {
        SystemStore.setToggle(false);
    };

    return (
        <>
            {render}
            <COACTUP_CACTUPAView
                location = {location}
                onKeyPressedAADDGRP = { onKeyPressedAADDGRP }
                onKeyPressedACCTSID = { onKeyPressedACCTSID }
                onKeyPressedACRCYCR = { onKeyPressedACRCYCR }
                onKeyPressedACRCYDB = { onKeyPressedACRCYDB }
                onKeyPressedACRDLIM = { onKeyPressedACRDLIM }
                onKeyPressedACSADL1 = { onKeyPressedACSADL1 }
                onKeyPressedACSADL2 = { onKeyPressedACSADL2 }
                onKeyPressedACSCITY = { onKeyPressedACSCITY }
                onKeyPressedACSCTRY = { onKeyPressedACSCTRY }
                onKeyPressedACSEFTC = { onKeyPressedACSEFTC }
                onKeyPressedACSFNAM = { onKeyPressedACSFNAM }
                onKeyPressedACSGOVT = { onKeyPressedACSGOVT }
                onKeyPressedACSHLIM = { onKeyPressedACSHLIM }
                onKeyPressedACSLNAM = { onKeyPressedACSLNAM }
                onKeyPressedACSMNAM = { onKeyPressedACSMNAM }
                onKeyPressedACSPFLG = { onKeyPressedACSPFLG }
                onKeyPressedACSPH1A = { onKeyPressedACSPH1A }
                onKeyPressedACSPH1B = { onKeyPressedACSPH1B }
                onKeyPressedACSPH1C = { onKeyPressedACSPH1C }
                onKeyPressedACSPH2A = { onKeyPressedACSPH2A }
                onKeyPressedACSPH2B = { onKeyPressedACSPH2B }
                onKeyPressedACSPH2C = { onKeyPressedACSPH2C }
                onKeyPressedACSSTTE = { onKeyPressedACSSTTE }
                onKeyPressedACSTFCO = { onKeyPressedACSTFCO }
                onKeyPressedACSTNUM = { onKeyPressedACSTNUM }
                onKeyPressedACSTTUS = { onKeyPressedACSTTUS }
                onKeyPressedACSZIPC = { onKeyPressedACSZIPC }
                onKeyPressedACTSSN1 = { onKeyPressedACTSSN1 }
                onKeyPressedACTSSN2 = { onKeyPressedACTSSN2 }
                onKeyPressedACTSSN3 = { onKeyPressedACTSSN3 }
                onKeyPressedACURBAL = { onKeyPressedACURBAL }
                onKeyPressedDOBDAY = { onKeyPressedDOBDAY }
                onKeyPressedDOBMON = { onKeyPressedDOBMON }
                onKeyPressedDOBYEAR = { onKeyPressedDOBYEAR }
                onKeyPressedEXPDAY = { onKeyPressedEXPDAY }
                onKeyPressedEXPMON = { onKeyPressedEXPMON }
                onKeyPressedEXPYEAR = { onKeyPressedEXPYEAR }
                onKeyPressedOPNDAY = { onKeyPressedOPNDAY }
                onKeyPressedOPNMON = { onKeyPressedOPNMON }
                onKeyPressedOPNYEAR = { onKeyPressedOPNYEAR }
                onKeyPressedRISDAY = { onKeyPressedRISDAY }
                onKeyPressedRISMON = { onKeyPressedRISMON }
                onKeyPressedRISYEAR = { onKeyPressedRISYEAR }
                TRNNAMERef = { TRNNAMERef }
                TITLE01Ref = { TITLE01Ref }
                CURDATERef = { CURDATERef }
                PGMNAMERef = { PGMNAMERef }
                TITLE02Ref = { TITLE02Ref }
                CURTIMERef = { CURTIMERef }
                ACCTSIDRef = { ACCTSIDRef }
                ACSTTUSRef = { ACSTTUSRef }
                OPNYEARRef = { OPNYEARRef }
                OPNMONRef = { OPNMONRef }
                OPNDAYRef = { OPNDAYRef }
                ACRDLIMRef = { ACRDLIMRef }
                EXPYEARRef = { EXPYEARRef }
                EXPMONRef = { EXPMONRef }
                EXPDAYRef = { EXPDAYRef }
                ACSHLIMRef = { ACSHLIMRef }
                RISYEARRef = { RISYEARRef }
                RISMONRef = { RISMONRef }
                RISDAYRef = { RISDAYRef }
                ACURBALRef = { ACURBALRef }
                ACRCYCRRef = { ACRCYCRRef }
                AADDGRPRef = { AADDGRPRef }
                ACRCYDBRef = { ACRCYDBRef }
                ACSTNUMRef = { ACSTNUMRef }
                ACTSSN1Ref = { ACTSSN1Ref }
                ACTSSN2Ref = { ACTSSN2Ref }
                ACTSSN3Ref = { ACTSSN3Ref }
                DOBYEARRef = { DOBYEARRef }
                DOBMONRef = { DOBMONRef }
                DOBDAYRef = { DOBDAYRef }
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
                ACSPH1ARef = { ACSPH1ARef }
                ACSPH1BRef = { ACSPH1BRef }
                ACSPH1CRef = { ACSPH1CRef }
                ACSGOVTRef = { ACSGOVTRef }
                ACSPH2ARef = { ACSPH2ARef }
                ACSPH2BRef = { ACSPH2BRef }
                ACSPH2CRef = { ACSPH2CRef }
                ACSEFTCRef = { ACSEFTCRef }
                ACSPFLGRef = { ACSPFLGRef }
                INFOMSGRef = { INFOMSGRef }
                ERRMSGRef = { ERRMSGRef }
                FKEYSRef = { FKEYSRef }
                FKEY05Ref = { FKEY05Ref }
                FKEY12Ref = { FKEY12Ref }
            />
            {systemDto.notification ? <Notification data = {systemDto.notification} toggle={SystemStore.toggle}
            handleClose = {notificationHandleClose}/> : null}
        </>
    );

});
export default COACTUP_CACTUPA;

