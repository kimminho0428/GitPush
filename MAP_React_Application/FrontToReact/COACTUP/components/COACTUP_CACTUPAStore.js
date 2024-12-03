import React from 'react';
import {observable} from "mobx";
import { CACTUPAI } from "../data/COACTUP_CACTUPAInputDto";
import RestPost from "../runtime/component/io/RestPost";
import {makeJson} from "../runtime/JsonFactory";
import COACTUP_CACTUPAValidation from "./COACTUP_CACTUPAValidation";
import {changeColorFlag, changeHighlight, convertPressedKey} from "../runtime/KeyEvent";

const COACTUP_CACTUPAStore = observable({
      TRNNAME: "",
      TITLE01: "",
      CURDATE: "",
      PGMNAME: "",
      TITLE02: "",
      CURTIME: "",
      ACCTSID: "",
      ACSTTUS: "",
      OPNYEAR: "",
      OPNMON: "",
      OPNDAY: "",
      ACRDLIM: "",
      EXPYEAR: "",
      EXPMON: "",
      EXPDAY: "",
      ACSHLIM: "",
      RISYEAR: "",
      RISMON: "",
      RISDAY: "",
      ACURBAL: "",
      ACRCYCR: "",
      AADDGRP: "",
      ACRCYDB: "",
      ACSTNUM: "",
      ACTSSN1: "",
      ACTSSN2: "",
      ACTSSN3: "",
      DOBYEAR: "",
      DOBMON: "",
      DOBDAY: "",
      ACSTFCO: "",
      ACSFNAM: "",
      ACSMNAM: "",
      ACSLNAM: "",
      ACSADL1: "",
      ACSSTTE: "",
      ACSADL2: "",
      ACSZIPC: "",
      ACSCITY: "",
      ACSCTRY: "",
      ACSPH1A: "",
      ACSPH1B: "",
      ACSPH1C: "",
      ACSGOVT: "",
      ACSPH2A: "",
      ACSPH2B: "",
      ACSPH2C: "",
      ACSEFTC: "",
      ACSPFLG: "",
      INFOMSG: "",
      ERRMSG: "",
      FKEYS: "",
      FKEY05: "",
      FKEY12: "",

      setAADDGRP(AADDGRP) {
        this.AADDGRP = AADDGRP
      },
      setACCTSID(ACCTSID) {
        this.ACCTSID = ACCTSID
      },
      setACRCYCR(ACRCYCR) {
        this.ACRCYCR = ACRCYCR
      },
      setACRCYDB(ACRCYDB) {
        this.ACRCYDB = ACRCYDB
      },
      setACRDLIM(ACRDLIM) {
        this.ACRDLIM = ACRDLIM
      },
      setACSADL1(ACSADL1) {
        this.ACSADL1 = ACSADL1
      },
      setACSADL2(ACSADL2) {
        this.ACSADL2 = ACSADL2
      },
      setACSCITY(ACSCITY) {
        this.ACSCITY = ACSCITY
      },
      setACSCTRY(ACSCTRY) {
        this.ACSCTRY = ACSCTRY
      },
      setACSEFTC(ACSEFTC) {
        this.ACSEFTC = ACSEFTC
      },
      setACSFNAM(ACSFNAM) {
        this.ACSFNAM = ACSFNAM
      },
      setACSGOVT(ACSGOVT) {
        this.ACSGOVT = ACSGOVT
      },
      setACSHLIM(ACSHLIM) {
        this.ACSHLIM = ACSHLIM
      },
      setACSLNAM(ACSLNAM) {
        this.ACSLNAM = ACSLNAM
      },
      setACSMNAM(ACSMNAM) {
        this.ACSMNAM = ACSMNAM
      },
      setACSPFLG(ACSPFLG) {
        this.ACSPFLG = ACSPFLG
      },
      setACSPH1A(ACSPH1A) {
        this.ACSPH1A = ACSPH1A
      },
      setACSPH1B(ACSPH1B) {
        this.ACSPH1B = ACSPH1B
      },
      setACSPH1C(ACSPH1C) {
        this.ACSPH1C = ACSPH1C
      },
      setACSPH2A(ACSPH2A) {
        this.ACSPH2A = ACSPH2A
      },
      setACSPH2B(ACSPH2B) {
        this.ACSPH2B = ACSPH2B
      },
      setACSPH2C(ACSPH2C) {
        this.ACSPH2C = ACSPH2C
      },
      setACSSTTE(ACSSTTE) {
        this.ACSSTTE = ACSSTTE
      },
      setACSTFCO(ACSTFCO) {
        this.ACSTFCO = ACSTFCO
      },
      setACSTNUM(ACSTNUM) {
        this.ACSTNUM = ACSTNUM
      },
      setACSTTUS(ACSTTUS) {
        this.ACSTTUS = ACSTTUS
      },
      setACSZIPC(ACSZIPC) {
        this.ACSZIPC = ACSZIPC
      },
      setACTSSN1(ACTSSN1) {
        this.ACTSSN1 = ACTSSN1
      },
      setACTSSN2(ACTSSN2) {
        this.ACTSSN2 = ACTSSN2
      },
      setACTSSN3(ACTSSN3) {
        this.ACTSSN3 = ACTSSN3
      },
      setACURBAL(ACURBAL) {
        this.ACURBAL = ACURBAL
      },
      setDOBDAY(DOBDAY) {
        this.DOBDAY = DOBDAY
      },
      setDOBMON(DOBMON) {
        this.DOBMON = DOBMON
      },
      setDOBYEAR(DOBYEAR) {
        this.DOBYEAR = DOBYEAR
      },
      setEXPDAY(EXPDAY) {
        this.EXPDAY = EXPDAY
      },
      setEXPMON(EXPMON) {
        this.EXPMON = EXPMON
      },
      setEXPYEAR(EXPYEAR) {
        this.EXPYEAR = EXPYEAR
      },
      setOPNDAY(OPNDAY) {
        this.OPNDAY = OPNDAY
      },
      setOPNMON(OPNMON) {
        this.OPNMON = OPNMON
      },
      setOPNYEAR(OPNYEAR) {
        this.OPNYEAR = OPNYEAR
      },
      setRISDAY(RISDAY) {
        this.RISDAY = RISDAY
      },
      setRISMON(RISMON) {
        this.RISMON = RISMON
      },
      setRISYEAR(RISYEAR) {
        this.RISYEAR = RISYEAR
      },

    render(parsedData) {
      if (parsedData == null) {
          this.TRNNAME = "";
          this.TITLE01 = "";
          this.CURDATE = "";
          this.PGMNAME = "";
          this.TITLE02 = "";
          this.CURTIME = "";
          this.ACCTSID = "";
          this.ACSTTUS = "";
          this.OPNYEAR = "";
          this.OPNMON = "";
          this.OPNDAY = "";
          this.ACRDLIM = "";
          this.EXPYEAR = "";
          this.EXPMON = "";
          this.EXPDAY = "";
          this.ACSHLIM = "";
          this.RISYEAR = "";
          this.RISMON = "";
          this.RISDAY = "";
          this.ACURBAL = "";
          this.ACRCYCR = "";
          this.AADDGRP = "";
          this.ACRCYDB = "";
          this.ACSTNUM = "";
          this.ACTSSN1 = "";
          this.ACTSSN2 = "";
          this.ACTSSN3 = "";
          this.DOBYEAR = "";
          this.DOBMON = "";
          this.DOBDAY = "";
          this.ACSTFCO = "";
          this.ACSFNAM = "";
          this.ACSMNAM = "";
          this.ACSLNAM = "";
          this.ACSADL1 = "";
          this.ACSSTTE = "";
          this.ACSADL2 = "";
          this.ACSZIPC = "";
          this.ACSCITY = "";
          this.ACSCTRY = "";
          this.ACSPH1A = "";
          this.ACSPH1B = "";
          this.ACSPH1C = "";
          this.ACSGOVT = "";
          this.ACSPH2A = "";
          this.ACSPH2B = "";
          this.ACSPH2C = "";
          this.ACSEFTC = "";
          this.ACSPFLG = "";
          this.INFOMSG = "";
          this.ERRMSG = "";
          this.FKEYS = "";
          this.FKEY05 = "";
          this.FKEY12 = "";
      }
        this.ACSTNUM = parsedData.acstnumo.trim() === '' ? '' : parsedData.acstnumo;
        this.ACSMNAM = parsedData.acsmnamo.trim() === '' ? '' : parsedData.acsmnamo;
        this.ACSSTTE = parsedData.acsstteo.trim() === '' ? '' : parsedData.acsstteo;
        this.DOBDAY = parsedData.dobdayo.trim() === '' ? '' : parsedData.dobdayo;
        this.ACRCYDB = parsedData.acrcydbo.trim() === '' ? '' : parsedData.acrcydbo;
        this.ACSTTUS = parsedData.acsttuso.trim() === '' ? '' : parsedData.acsttuso;
        this.ACSCTRY = parsedData.acsctryo.trim() === '' ? '' : parsedData.acsctryo;
        this.ERRMSG = parsedData.errmsgo.trim() === '' ? '' : parsedData.errmsgo;
        this.CURTIME = parsedData.curtimeo.trim() === '' ? '' : parsedData.curtimeo;
        this.OPNDAY = parsedData.opndayo.trim() === '' ? '' : parsedData.opndayo;
        this.DOBYEAR = parsedData.dobyearo.trim() === '' ? '' : parsedData.dobyearo;
        this.RISDAY = parsedData.risdayo.trim() === '' ? '' : parsedData.risdayo;
        this.ACSFNAM = parsedData.acsfnamo.trim() === '' ? '' : parsedData.acsfnamo;
        this.ACSPH1A = parsedData.acsph1ao.trim() === '' ? '' : parsedData.acsph1ao;
        this.ACCTSID = parsedData.acctsido.trim() === '' ? '' : parsedData.acctsido;
        this.ACSPH1B = parsedData.acsph1bo.trim() === '' ? '' : parsedData.acsph1bo;
        this.AADDGRP = parsedData.aaddgrpo.trim() === '' ? '' : parsedData.aaddgrpo;
        this.ACSPH1C = parsedData.acsph1co.trim() === '' ? '' : parsedData.acsph1co;
        this.ACSCITY = parsedData.acscityo.trim() === '' ? '' : parsedData.acscityo;
        this.FKEY12 = parsedData.fkey12o.trim() === '' ? '' : parsedData.fkey12o;
        this.RISYEAR = parsedData.risyearo.trim() === '' ? '' : parsedData.risyearo;
        this.INFOMSG = parsedData.infomsgo.trim() === '' ? '' : parsedData.infomsgo;
        this.ACRCYCR = parsedData.acrcycro.trim() === '' ? '' : parsedData.acrcycro;
        this.ACSPH2A = parsedData.acsph2ao.trim() === '' ? '' : parsedData.acsph2ao;
        this.ACSPH2B = parsedData.acsph2bo.trim() === '' ? '' : parsedData.acsph2bo;
        this.ACSPH2C = parsedData.acsph2co.trim() === '' ? '' : parsedData.acsph2co;
        this.ACSEFTC = parsedData.acseftco.trim() === '' ? '' : parsedData.acseftco;
        this.PGMNAME = parsedData.pgmnameo.trim() === '' ? '' : parsedData.pgmnameo;
        this.CURDATE = parsedData.curdateo.trim() === '' ? '' : parsedData.curdateo;
        this.ACSADL1 = parsedData.acsadl1o.trim() === '' ? '' : parsedData.acsadl1o;
        this.ACSADL2 = parsedData.acsadl2o.trim() === '' ? '' : parsedData.acsadl2o;
        this.FKEYS = parsedData.fkeyso.trim() === '' ? '' : parsedData.fkeyso;
        this.FKEY05 = parsedData.fkey05o.trim() === '' ? '' : parsedData.fkey05o;
        this.ACSTFCO = parsedData.acstfcoo.trim() === '' ? '' : parsedData.acstfcoo;
        this.OPNYEAR = parsedData.opnyearo.trim() === '' ? '' : parsedData.opnyearo;
        this.ACURBAL = parsedData.acurbalo.trim() === '' ? '' : parsedData.acurbalo;
        this.ACSZIPC = parsedData.acszipco.trim() === '' ? '' : parsedData.acszipco;
        this.TITLE01 = parsedData.title01o.trim() === '' ? '' : parsedData.title01o;
        this.TITLE02 = parsedData.title02o.trim() === '' ? '' : parsedData.title02o;
        this.ACSLNAM = parsedData.acslnamo.trim() === '' ? '' : parsedData.acslnamo;
        this.ACSPFLG = parsedData.acspflgo.trim() === '' ? '' : parsedData.acspflgo;
        this.EXPDAY = parsedData.expdayo.trim() === '' ? '' : parsedData.expdayo;
        this.ACSHLIM = parsedData.acshlimo.trim() === '' ? '' : parsedData.acshlimo;
        this.OPNMON = parsedData.opnmono.trim() === '' ? '' : parsedData.opnmono;
        this.ACTSSN1 = parsedData.actssn1o.trim() === '' ? '' : parsedData.actssn1o;
        this.ACTSSN2 = parsedData.actssn2o.trim() === '' ? '' : parsedData.actssn2o;
        this.ACTSSN3 = parsedData.actssn3o.trim() === '' ? '' : parsedData.actssn3o;
        this.RISMON = parsedData.rismono.trim() === '' ? '' : parsedData.rismono;
        this.ACSGOVT = parsedData.acsgovto.trim() === '' ? '' : parsedData.acsgovto;
        this.ACRDLIM = parsedData.acrdlimo.trim() === '' ? '' : parsedData.acrdlimo;
        this.TRNNAME = parsedData.trnnameo.trim() === '' ? '' : parsedData.trnnameo;
        this.EXPYEAR = parsedData.expyearo.trim() === '' ? '' : parsedData.expyearo;
        this.EXPMON = parsedData.expmono.trim() === '' ? '' : parsedData.expmono;
        this.DOBMON = parsedData.dobmono.trim() === '' ? '' : parsedData.dobmono;
    },

    renderStyle(parsedData, TRNNAMERef , TITLE01Ref , CURDATERef , PGMNAMERef , TITLE02Ref , CURTIMERef , ACCTSIDRef , ACSTTUSRef , OPNYEARRef , OPNMONRef , OPNDAYRef , ACRDLIMRef , EXPYEARRef , EXPMONRef , EXPDAYRef , ACSHLIMRef , RISYEARRef , RISMONRef , RISDAYRef , ACURBALRef , ACRCYCRRef , AADDGRPRef , ACRCYDBRef , ACSTNUMRef , ACTSSN1Ref , ACTSSN2Ref , ACTSSN3Ref , DOBYEARRef , DOBMONRef , DOBDAYRef , ACSTFCORef , ACSFNAMRef , ACSMNAMRef , ACSLNAMRef , ACSADL1Ref , ACSSTTERef , ACSADL2Ref , ACSZIPCRef , ACSCITYRef , ACSCTRYRef , ACSPH1ARef , ACSPH1BRef , ACSPH1CRef , ACSGOVTRef , ACSPH2ARef , ACSPH2BRef , ACSPH2CRef , ACSEFTCRef , ACSPFLGRef , INFOMSGRef , ERRMSGRef , FKEYSRef , FKEY05Ref , FKEY12Ref ) {
      if(parsedData !== null) {
          ACSTNUMRef.current.style.color = changeColorFlag(parsedData.acstnumc);
          ACSMNAMRef.current.style.color = changeColorFlag(parsedData.acsmnamc);
          ACSSTTERef.current.style.color = changeColorFlag(parsedData.acssttec);
          DOBDAYRef.current.style.color = changeColorFlag(parsedData.dobdayc);
          ACRCYDBRef.current.style.color = changeColorFlag(parsedData.acrcydbc);
          ACSTTUSRef.current.style.color = changeColorFlag(parsedData.acsttusc);
          ACSCTRYRef.current.style.color = changeColorFlag(parsedData.acsctryc);
          ERRMSGRef.current.style.color = changeColorFlag(parsedData.errmsgc);
          CURTIMERef.current.style.color = changeColorFlag(parsedData.curtimec);
          OPNDAYRef.current.style.color = changeColorFlag(parsedData.opndayc);
          DOBYEARRef.current.style.color = changeColorFlag(parsedData.dobyearc);
          RISDAYRef.current.style.color = changeColorFlag(parsedData.risdayc);
          ACSFNAMRef.current.style.color = changeColorFlag(parsedData.acsfnamc);
          ACSPH1ARef.current.style.color = changeColorFlag(parsedData.acsph1ac);
          ACCTSIDRef.current.style.color = changeColorFlag(parsedData.acctsidc);
          ACSPH1BRef.current.style.color = changeColorFlag(parsedData.acsph1bc);
          AADDGRPRef.current.style.color = changeColorFlag(parsedData.aaddgrpc);
          ACSPH1CRef.current.style.color = changeColorFlag(parsedData.acsph1cc);
          ACSCITYRef.current.style.color = changeColorFlag(parsedData.acscityc);
          FKEY12Ref.current.style.color = changeColorFlag(parsedData.fkey12c);
          RISYEARRef.current.style.color = changeColorFlag(parsedData.risyearc);
          INFOMSGRef.current.style.color = changeColorFlag(parsedData.infomsgc);
          ACRCYCRRef.current.style.color = changeColorFlag(parsedData.acrcycrc);
          ACSPH2ARef.current.style.color = changeColorFlag(parsedData.acsph2ac);
          ACSPH2BRef.current.style.color = changeColorFlag(parsedData.acsph2bc);
          ACSPH2CRef.current.style.color = changeColorFlag(parsedData.acsph2cc);
          ACSEFTCRef.current.style.color = changeColorFlag(parsedData.acseftcc);
          PGMNAMERef.current.style.color = changeColorFlag(parsedData.pgmnamec);
          CURDATERef.current.style.color = changeColorFlag(parsedData.curdatec);
          ACSADL1Ref.current.style.color = changeColorFlag(parsedData.acsadl1c);
          ACSADL2Ref.current.style.color = changeColorFlag(parsedData.acsadl2c);
          FKEYSRef.current.style.color = changeColorFlag(parsedData.fkeysc);
          FKEY05Ref.current.style.color = changeColorFlag(parsedData.fkey05c);
          ACSTFCORef.current.style.color = changeColorFlag(parsedData.acstfcoc);
          OPNYEARRef.current.style.color = changeColorFlag(parsedData.opnyearc);
          ACURBALRef.current.style.color = changeColorFlag(parsedData.acurbalc);
          ACSZIPCRef.current.style.color = changeColorFlag(parsedData.acszipcc);
          TITLE01Ref.current.style.color = changeColorFlag(parsedData.title01c);
          TITLE02Ref.current.style.color = changeColorFlag(parsedData.title02c);
          ACSLNAMRef.current.style.color = changeColorFlag(parsedData.acslnamc);
          ACSPFLGRef.current.style.color = changeColorFlag(parsedData.acspflgc);
          EXPDAYRef.current.style.color = changeColorFlag(parsedData.expdayc);
          ACSHLIMRef.current.style.color = changeColorFlag(parsedData.acshlimc);
          OPNMONRef.current.style.color = changeColorFlag(parsedData.opnmonc);
          ACTSSN1Ref.current.style.color = changeColorFlag(parsedData.actssn1c);
          ACTSSN2Ref.current.style.color = changeColorFlag(parsedData.actssn2c);
          ACTSSN3Ref.current.style.color = changeColorFlag(parsedData.actssn3c);
          RISMONRef.current.style.color = changeColorFlag(parsedData.rismonc);
          ACSGOVTRef.current.style.color = changeColorFlag(parsedData.acsgovtc);
          ACRDLIMRef.current.style.color = changeColorFlag(parsedData.acrdlimc);
          TRNNAMERef.current.style.color = changeColorFlag(parsedData.trnnamec);
          EXPYEARRef.current.style.color = changeColorFlag(parsedData.expyearc);
          EXPMONRef.current.style.color = changeColorFlag(parsedData.expmonc);
          DOBMONRef.current.style.color = changeColorFlag(parsedData.dobmonc);

          changeHighlight(ACSTNUMRef, parsedData.acstnumh);
          changeHighlight(ACSMNAMRef, parsedData.acsmnamh);
          changeHighlight(ACSSTTERef, parsedData.acsstteh);
          changeHighlight(DOBDAYRef, parsedData.dobdayh);
          changeHighlight(ACRCYDBRef, parsedData.acrcydbh);
          changeHighlight(ACSTTUSRef, parsedData.acsttush);
          changeHighlight(ACSCTRYRef, parsedData.acsctryh);
          changeHighlight(ERRMSGRef, parsedData.errmsgh);
          changeHighlight(CURTIMERef, parsedData.curtimeh);
          changeHighlight(OPNDAYRef, parsedData.opndayh);
          changeHighlight(DOBYEARRef, parsedData.dobyearh);
          changeHighlight(RISDAYRef, parsedData.risdayh);
          changeHighlight(ACSFNAMRef, parsedData.acsfnamh);
          changeHighlight(ACSPH1ARef, parsedData.acsph1ah);
          changeHighlight(ACCTSIDRef, parsedData.acctsidh);
          changeHighlight(ACSPH1BRef, parsedData.acsph1bh);
          changeHighlight(AADDGRPRef, parsedData.aaddgrph);
          changeHighlight(ACSPH1CRef, parsedData.acsph1ch);
          changeHighlight(ACSCITYRef, parsedData.acscityh);
          changeHighlight(FKEY12Ref, parsedData.fkey12h);
          changeHighlight(RISYEARRef, parsedData.risyearh);
          changeHighlight(INFOMSGRef, parsedData.infomsgh);
          changeHighlight(ACRCYCRRef, parsedData.acrcycrh);
          changeHighlight(ACSPH2ARef, parsedData.acsph2ah);
          changeHighlight(ACSPH2BRef, parsedData.acsph2bh);
          changeHighlight(ACSPH2CRef, parsedData.acsph2ch);
          changeHighlight(ACSEFTCRef, parsedData.acseftch);
          changeHighlight(PGMNAMERef, parsedData.pgmnameh);
          changeHighlight(CURDATERef, parsedData.curdateh);
          changeHighlight(ACSADL1Ref, parsedData.acsadl1h);
          changeHighlight(ACSADL2Ref, parsedData.acsadl2h);
          changeHighlight(FKEYSRef, parsedData.fkeysh);
          changeHighlight(FKEY05Ref, parsedData.fkey05h);
          changeHighlight(ACSTFCORef, parsedData.acstfcoh);
          changeHighlight(OPNYEARRef, parsedData.opnyearh);
          changeHighlight(ACURBALRef, parsedData.acurbalh);
          changeHighlight(ACSZIPCRef, parsedData.acszipch);
          changeHighlight(TITLE01Ref, parsedData.title01h);
          changeHighlight(TITLE02Ref, parsedData.title02h);
          changeHighlight(ACSLNAMRef, parsedData.acslnamh);
          changeHighlight(ACSPFLGRef, parsedData.acspflgh);
          changeHighlight(EXPDAYRef, parsedData.expdayh);
          changeHighlight(ACSHLIMRef, parsedData.acshlimh);
          changeHighlight(OPNMONRef, parsedData.opnmonh);
          changeHighlight(ACTSSN1Ref, parsedData.actssn1h);
          changeHighlight(ACTSSN2Ref, parsedData.actssn2h);
          changeHighlight(ACTSSN3Ref, parsedData.actssn3h);
          changeHighlight(RISMONRef, parsedData.rismonh);
          changeHighlight(ACSGOVTRef, parsedData.acsgovth);
          changeHighlight(ACRDLIMRef, parsedData.acrdlimh);
          changeHighlight(TRNNAMERef, parsedData.trnnameh);
          changeHighlight(EXPYEARRef, parsedData.expyearh);
          changeHighlight(EXPMONRef, parsedData.expmonh);
          changeHighlight(DOBMONRef, parsedData.dobmonh);
      }
    },

    request(systemDto, keyCode, serverUrl, history, AADDGRPRef, ACCTSIDRef, ACRCYCRRef, ACRCYDBRef, ACRDLIMRef, ACSADL1Ref, ACSADL2Ref, ACSCITYRef, ACSCTRYRef, ACSEFTCRef, ACSFNAMRef, ACSGOVTRef, ACSHLIMRef, ACSLNAMRef, ACSMNAMRef, ACSPFLGRef, ACSPH1ARef, ACSPH1BRef, ACSPH1CRef, ACSPH2ARef, ACSPH2BRef, ACSPH2CRef, ACSSTTERef, ACSTFCORef, ACSTNUMRef, ACSTTUSRef, ACSZIPCRef, ACTSSN1Ref, ACTSSN2Ref, ACTSSN3Ref, ACURBALRef, DOBDAYRef, DOBMONRef, DOBYEARRef, EXPDAYRef, EXPMONRef, EXPYEARRef, OPNDAYRef, OPNMONRef, OPNYEARRef, RISDAYRef, RISMONRef, RISYEARRef) {
        if(COACTUP_CACTUPAValidation({  AADDGRP : this.AADDGRP, AADDGRPRef : AADDGRPRef, ACCTSID : this.ACCTSID, ACCTSIDRef : ACCTSIDRef, ACRCYCR : this.ACRCYCR, ACRCYCRRef : ACRCYCRRef, ACRCYDB : this.ACRCYDB, ACRCYDBRef : ACRCYDBRef, ACRDLIM : this.ACRDLIM, ACRDLIMRef : ACRDLIMRef, ACSADL1 : this.ACSADL1, ACSADL1Ref : ACSADL1Ref, ACSADL2 : this.ACSADL2, ACSADL2Ref : ACSADL2Ref, ACSCITY : this.ACSCITY, ACSCITYRef : ACSCITYRef, ACSCTRY : this.ACSCTRY, ACSCTRYRef : ACSCTRYRef, ACSEFTC : this.ACSEFTC, ACSEFTCRef : ACSEFTCRef, ACSFNAM : this.ACSFNAM, ACSFNAMRef : ACSFNAMRef, ACSGOVT : this.ACSGOVT, ACSGOVTRef : ACSGOVTRef, ACSHLIM : this.ACSHLIM, ACSHLIMRef : ACSHLIMRef, ACSLNAM : this.ACSLNAM, ACSLNAMRef : ACSLNAMRef, ACSMNAM : this.ACSMNAM, ACSMNAMRef : ACSMNAMRef, ACSPFLG : this.ACSPFLG, ACSPFLGRef : ACSPFLGRef, ACSPH1A : this.ACSPH1A, ACSPH1ARef : ACSPH1ARef, ACSPH1B : this.ACSPH1B, ACSPH1BRef : ACSPH1BRef, ACSPH1C : this.ACSPH1C, ACSPH1CRef : ACSPH1CRef, ACSPH2A : this.ACSPH2A, ACSPH2ARef : ACSPH2ARef, ACSPH2B : this.ACSPH2B, ACSPH2BRef : ACSPH2BRef, ACSPH2C : this.ACSPH2C, ACSPH2CRef : ACSPH2CRef, ACSSTTE : this.ACSSTTE, ACSSTTERef : ACSSTTERef, ACSTFCO : this.ACSTFCO, ACSTFCORef : ACSTFCORef, ACSTNUM : this.ACSTNUM, ACSTNUMRef : ACSTNUMRef, ACSTTUS : this.ACSTTUS, ACSTTUSRef : ACSTTUSRef, ACSZIPC : this.ACSZIPC, ACSZIPCRef : ACSZIPCRef, ACTSSN1 : this.ACTSSN1, ACTSSN1Ref : ACTSSN1Ref, ACTSSN2 : this.ACTSSN2, ACTSSN2Ref : ACTSSN2Ref, ACTSSN3 : this.ACTSSN3, ACTSSN3Ref : ACTSSN3Ref, ACURBAL : this.ACURBAL, ACURBALRef : ACURBALRef, DOBDAY : this.DOBDAY, DOBDAYRef : DOBDAYRef, DOBMON : this.DOBMON, DOBMONRef : DOBMONRef, DOBYEAR : this.DOBYEAR, DOBYEARRef : DOBYEARRef, EXPDAY : this.EXPDAY, EXPDAYRef : EXPDAYRef, EXPMON : this.EXPMON, EXPMONRef : EXPMONRef, EXPYEAR : this.EXPYEAR, EXPYEARRef : EXPYEARRef, OPNDAY : this.OPNDAY, OPNDAYRef : OPNDAYRef, OPNMON : this.OPNMON, OPNMONRef : OPNMONRef, OPNYEAR : this.OPNYEAR, OPNYEARRef : OPNYEARRef, RISDAY : this.RISDAY, RISDAYRef : RISDAYRef, RISMON : this.RISMON, RISMONRef : RISMONRef, RISYEAR : this.RISYEAR, RISYEARRef : RISYEARRef, }) === false) {
            return;
        }

        CACTUPAI.errmsgi = this.ERRMSG;
        CACTUPAI.errmsgl = this.ERRMSG.length;
        CACTUPAI.trnnamei = this.TRNNAME;
        CACTUPAI.trnnamel = this.TRNNAME.length;
        CACTUPAI.aaddgrpi = this.AADDGRP;
        CACTUPAI.aaddgrpl = this.AADDGRP.length;
        CACTUPAI.acctsidi = this.ACCTSID;
        CACTUPAI.acctsidl = this.ACCTSID.length;
        CACTUPAI.acrcycri = this.ACRCYCR;
        CACTUPAI.acrcycrl = this.ACRCYCR.length;
        CACTUPAI.acrcydbi = this.ACRCYDB;
        CACTUPAI.acrcydbl = this.ACRCYDB.length;
        CACTUPAI.acrdlimi = this.ACRDLIM;
        CACTUPAI.acrdliml = this.ACRDLIM.length;
        CACTUPAI.acsadl1i = this.ACSADL1;
        CACTUPAI.acsadl1l = this.ACSADL1.length;
        CACTUPAI.acsadl2i = this.ACSADL2;
        CACTUPAI.acsadl2l = this.ACSADL2.length;
        CACTUPAI.acscityi = this.ACSCITY;
        CACTUPAI.acscityl = this.ACSCITY.length;
        CACTUPAI.acsctryi = this.ACSCTRY;
        CACTUPAI.acsctryl = this.ACSCTRY.length;
        CACTUPAI.acseftci = this.ACSEFTC;
        CACTUPAI.acseftcl = this.ACSEFTC.length;
        CACTUPAI.acsfnami = this.ACSFNAM;
        CACTUPAI.acsfnaml = this.ACSFNAM.length;
        CACTUPAI.acsgovti = this.ACSGOVT;
        CACTUPAI.acsgovtl = this.ACSGOVT.length;
        CACTUPAI.acshlimi = this.ACSHLIM;
        CACTUPAI.acshliml = this.ACSHLIM.length;
        CACTUPAI.acslnami = this.ACSLNAM;
        CACTUPAI.acslnaml = this.ACSLNAM.length;
        CACTUPAI.acsmnami = this.ACSMNAM;
        CACTUPAI.acsmnaml = this.ACSMNAM.length;
        CACTUPAI.acspflgi = this.ACSPFLG;
        CACTUPAI.acspflgl = this.ACSPFLG.length;
        CACTUPAI.acsph1ai = this.ACSPH1A;
        CACTUPAI.acsph1al = this.ACSPH1A.length;
        CACTUPAI.acsph1bi = this.ACSPH1B;
        CACTUPAI.acsph1bl = this.ACSPH1B.length;
        CACTUPAI.acsph1ci = this.ACSPH1C;
        CACTUPAI.acsph1cl = this.ACSPH1C.length;
        CACTUPAI.acsph2ai = this.ACSPH2A;
        CACTUPAI.acsph2al = this.ACSPH2A.length;
        CACTUPAI.acsph2bi = this.ACSPH2B;
        CACTUPAI.acsph2bl = this.ACSPH2B.length;
        CACTUPAI.acsph2ci = this.ACSPH2C;
        CACTUPAI.acsph2cl = this.ACSPH2C.length;
        CACTUPAI.acssttei = this.ACSSTTE;
        CACTUPAI.acssttel = this.ACSSTTE.length;
        CACTUPAI.acstfcoi = this.ACSTFCO;
        CACTUPAI.acstfcol = this.ACSTFCO.length;
        CACTUPAI.acstnumi = this.ACSTNUM;
        CACTUPAI.acstnuml = this.ACSTNUM.length;
        CACTUPAI.acsttusi = this.ACSTTUS;
        CACTUPAI.acsttusl = this.ACSTTUS.length;
        CACTUPAI.acszipci = this.ACSZIPC;
        CACTUPAI.acszipcl = this.ACSZIPC.length;
        CACTUPAI.actssn1i = this.ACTSSN1;
        CACTUPAI.actssn1l = this.ACTSSN1.length;
        CACTUPAI.actssn2i = this.ACTSSN2;
        CACTUPAI.actssn2l = this.ACTSSN2.length;
        CACTUPAI.actssn3i = this.ACTSSN3;
        CACTUPAI.actssn3l = this.ACTSSN3.length;
        CACTUPAI.acurbali = this.ACURBAL;
        CACTUPAI.acurball = this.ACURBAL.length;
        CACTUPAI.dobdayi = this.DOBDAY;
        CACTUPAI.dobdayl = this.DOBDAY.length;
        CACTUPAI.dobmoni = this.DOBMON;
        CACTUPAI.dobmonl = this.DOBMON.length;
        CACTUPAI.dobyeari = this.DOBYEAR;
        CACTUPAI.dobyearl = this.DOBYEAR.length;
        CACTUPAI.expdayi = this.EXPDAY;
        CACTUPAI.expdayl = this.EXPDAY.length;
        CACTUPAI.expmoni = this.EXPMON;
        CACTUPAI.expmonl = this.EXPMON.length;
        CACTUPAI.expyeari = this.EXPYEAR;
        CACTUPAI.expyearl = this.EXPYEAR.length;
        CACTUPAI.opndayi = this.OPNDAY;
        CACTUPAI.opndayl = this.OPNDAY.length;
        CACTUPAI.opnmoni = this.OPNMON;
        CACTUPAI.opnmonl = this.OPNMON.length;
        CACTUPAI.opnyeari = this.OPNYEAR;
        CACTUPAI.opnyearl = this.OPNYEAR.length;
        CACTUPAI.risdayi = this.RISDAY;
        CACTUPAI.risdayl = this.RISDAY.length;
        CACTUPAI.rismoni = this.RISMON;
        CACTUPAI.rismonl = this.RISMON.length;
        CACTUPAI.risyeari = this.RISYEAR;
        CACTUPAI.risyearl = this.RISYEAR.length;

        let request = makeJson("userId", convertPressedKey(keyCode));
        request.CACTUPAI = CACTUPAI;
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;
        RestPost(history, request, serverUrl, "COACTUP_CACTUPA");
    },

    simpleRequest(systemDto, keyCode, serverUrl, history) {
        let request = makeJson("userId", convertPressedKey(keyCode));
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;

        console.log("simple request [next tx:]" + request.systemDto.nextTransaction);
        RestPost(history, request, serverUrl, "COACTUP_CACTUPA");
    }
});

export default COACTUP_CACTUPAStore;

