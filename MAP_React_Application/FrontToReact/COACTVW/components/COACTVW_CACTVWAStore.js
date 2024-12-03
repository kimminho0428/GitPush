import React from 'react';
import {observable} from "mobx";
import { CACTVWAI } from "../data/COACTVW_CACTVWAInputDto";
import RestPost from "../runtime/component/io/RestPost";
import {makeJson} from "../runtime/JsonFactory";
import COACTVW_CACTVWAValidation from "./COACTVW_CACTVWAValidation";
import {changeColorFlag, changeHighlight, convertPressedKey} from "../runtime/KeyEvent";

const COACTVW_CACTVWAStore = observable({
      TRNNAME: "",
      TITLE01: "",
      CURDATE: "",
      PGMNAME: "",
      TITLE02: "",
      CURTIME: "",
      ACCTSID: "",
      ACSTTUS: "",
      ADTOPEN: "",
      ACRDLIM: "",
      AEXPDT: "",
      ACSHLIM: "",
      AREISDT: "",
      ACURBAL: "",
      ACRCYCR: "",
      AADDGRP: "",
      ACRCYDB: "",
      ACSTNUM: "",
      ACSTSSN: "",
      ACSTDOB: "",
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
      ACSPHN1: "",
      ACSGOVT: "",
      ACSPHN2: "",
      ACSEFTC: "",
      ACSPFLG: "",
      INFOMSG: "",
      ERRMSG: "",

      setACCTSID(ACCTSID) {
        this.ACCTSID = ACCTSID
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
          this.ADTOPEN = "";
          this.ACRDLIM = "";
          this.AEXPDT = "";
          this.ACSHLIM = "";
          this.AREISDT = "";
          this.ACURBAL = "";
          this.ACRCYCR = "";
          this.AADDGRP = "";
          this.ACRCYDB = "";
          this.ACSTNUM = "";
          this.ACSTSSN = "";
          this.ACSTDOB = "";
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
          this.ACSPHN1 = "";
          this.ACSGOVT = "";
          this.ACSPHN2 = "";
          this.ACSEFTC = "";
          this.ACSPFLG = "";
          this.INFOMSG = "";
          this.ERRMSG = "";
      }
        this.ACSADL1 = parsedData.acsadl1o.trim() === '' ? '' : parsedData.acsadl1o;
        this.ACSTNUM = parsedData.acstnumo.trim() === '' ? '' : parsedData.acstnumo;
        this.ACSMNAM = parsedData.acsmnamo.trim() === '' ? '' : parsedData.acsmnamo;
        this.ACSSTTE = parsedData.acsstteo.trim() === '' ? '' : parsedData.acsstteo;
        this.ACSADL2 = parsedData.acsadl2o.trim() === '' ? '' : parsedData.acsadl2o;
        this.ACSTSSN = parsedData.acstssno.trim() === '' ? '' : parsedData.acstssno;
        this.AEXPDT = parsedData.aexpdto.trim() === '' ? '' : parsedData.aexpdto;
        this.ACSPHN1 = parsedData.acsphn1o.trim() === '' ? '' : parsedData.acsphn1o;
        this.ACSTTUS = parsedData.acsttuso.trim() === '' ? '' : parsedData.acsttuso;
        this.ACSTFCO = parsedData.acstfcoo.trim() === '' ? '' : parsedData.acstfcoo;
        this.ACSPHN2 = parsedData.acsphn2o.trim() === '' ? '' : parsedData.acsphn2o;
        this.ACSCTRY = parsedData.acsctryo.trim() === '' ? '' : parsedData.acsctryo;
        this.ERRMSG = parsedData.errmsgo.trim() === '' ? '' : parsedData.errmsgo;
        this.CURTIME = parsedData.curtimeo.trim() === '' ? '' : parsedData.curtimeo;
        this.ACSZIPC = parsedData.acszipco.trim() === '' ? '' : parsedData.acszipco;
        this.ADTOPEN = parsedData.adtopeno.trim() === '' ? '' : parsedData.adtopeno;
        this.TITLE01 = parsedData.title01o.trim() === '' ? '' : parsedData.title01o;
        this.ACSFNAM = parsedData.acsfnamo.trim() === '' ? '' : parsedData.acsfnamo;
        this.TITLE02 = parsedData.title02o.trim() === '' ? '' : parsedData.title02o;
        this.ACCTSID = parsedData.acctsido.trim() === '' ? '' : parsedData.acctsido;
        this.AADDGRP = parsedData.aaddgrpo.trim() === '' ? '' : parsedData.aaddgrpo;
        this.ACSLNAM = parsedData.acslnamo.trim() === '' ? '' : parsedData.acslnamo;
        this.ACSPFLG = parsedData.acspflgo.trim() === '' ? '' : parsedData.acspflgo;
        this.ACSCITY = parsedData.acscityo.trim() === '' ? '' : parsedData.acscityo;
        this.ACSGOVT = parsedData.acsgovto.trim() === '' ? '' : parsedData.acsgovto;
        this.TRNNAME = parsedData.trnnameo.trim() === '' ? '' : parsedData.trnnameo;
        this.INFOMSG = parsedData.infomsgo.trim() === '' ? '' : parsedData.infomsgo;
        this.ACSTDOB = parsedData.acstdobo.trim() === '' ? '' : parsedData.acstdobo;
        this.ACSEFTC = parsedData.acseftco.trim() === '' ? '' : parsedData.acseftco;
        this.PGMNAME = parsedData.pgmnameo.trim() === '' ? '' : parsedData.pgmnameo;
        this.CURDATE = parsedData.curdateo.trim() === '' ? '' : parsedData.curdateo;
        this.AREISDT = parsedData.areisdto.trim() === '' ? '' : parsedData.areisdto;
        this.ACRCYDB = parsedData.acrcydbo;
        this.ACURBAL = parsedData.acurbalo;
        this.ACSHLIM = parsedData.acshlimo;
        this.ACRDLIM = parsedData.acrdlimo;
        this.ACRCYCR = parsedData.acrcycro;
    },

    renderStyle(parsedData, TRNNAMERef , TITLE01Ref , CURDATERef , PGMNAMERef , TITLE02Ref , CURTIMERef , ACCTSIDRef , ACSTTUSRef , ADTOPENRef , ACRDLIMRef , AEXPDTRef , ACSHLIMRef , AREISDTRef , ACURBALRef , ACRCYCRRef , AADDGRPRef , ACRCYDBRef , ACSTNUMRef , ACSTSSNRef , ACSTDOBRef , ACSTFCORef , ACSFNAMRef , ACSMNAMRef , ACSLNAMRef , ACSADL1Ref , ACSSTTERef , ACSADL2Ref , ACSZIPCRef , ACSCITYRef , ACSCTRYRef , ACSPHN1Ref , ACSGOVTRef , ACSPHN2Ref , ACSEFTCRef , ACSPFLGRef , INFOMSGRef , ERRMSGRef ) {
      if(parsedData !== null) {
          ACSADL1Ref.current.style.color = changeColorFlag(parsedData.acsadl1c);
          ACSTNUMRef.current.style.color = changeColorFlag(parsedData.acstnumc);
          ACSMNAMRef.current.style.color = changeColorFlag(parsedData.acsmnamc);
          ACSSTTERef.current.style.color = changeColorFlag(parsedData.acssttec);
          ACSADL2Ref.current.style.color = changeColorFlag(parsedData.acsadl2c);
          ACRCYDBRef.current.style.color = changeColorFlag(parsedData.acrcydbc);
          ACSTSSNRef.current.style.color = changeColorFlag(parsedData.acstssnc);
          AEXPDTRef.current.style.color = changeColorFlag(parsedData.aexpdtc);
          ACSPHN1Ref.current.style.color = changeColorFlag(parsedData.acsphn1c);
          ACSTTUSRef.current.style.color = changeColorFlag(parsedData.acsttusc);
          ACSTFCORef.current.style.color = changeColorFlag(parsedData.acstfcoc);
          ACSPHN2Ref.current.style.color = changeColorFlag(parsedData.acsphn2c);
          ACSCTRYRef.current.style.color = changeColorFlag(parsedData.acsctryc);
          ACURBALRef.current.style.color = changeColorFlag(parsedData.acurbalc);
          ERRMSGRef.current.style.color = changeColorFlag(parsedData.errmsgc);
          CURTIMERef.current.style.color = changeColorFlag(parsedData.curtimec);
          ACSZIPCRef.current.style.color = changeColorFlag(parsedData.acszipcc);
          ADTOPENRef.current.style.color = changeColorFlag(parsedData.adtopenc);
          TITLE01Ref.current.style.color = changeColorFlag(parsedData.title01c);
          ACSFNAMRef.current.style.color = changeColorFlag(parsedData.acsfnamc);
          TITLE02Ref.current.style.color = changeColorFlag(parsedData.title02c);
          ACCTSIDRef.current.style.color = changeColorFlag(parsedData.acctsidc);
          AADDGRPRef.current.style.color = changeColorFlag(parsedData.aaddgrpc);
          ACSLNAMRef.current.style.color = changeColorFlag(parsedData.acslnamc);
          ACSPFLGRef.current.style.color = changeColorFlag(parsedData.acspflgc);
          ACSHLIMRef.current.style.color = changeColorFlag(parsedData.acshlimc);
          ACSCITYRef.current.style.color = changeColorFlag(parsedData.acscityc);
          ACSGOVTRef.current.style.color = changeColorFlag(parsedData.acsgovtc);
          ACRDLIMRef.current.style.color = changeColorFlag(parsedData.acrdlimc);
          TRNNAMERef.current.style.color = changeColorFlag(parsedData.trnnamec);
          INFOMSGRef.current.style.color = changeColorFlag(parsedData.infomsgc);
          ACSTDOBRef.current.style.color = changeColorFlag(parsedData.acstdobc);
          ACRCYCRRef.current.style.color = changeColorFlag(parsedData.acrcycrc);
          ACSEFTCRef.current.style.color = changeColorFlag(parsedData.acseftcc);
          PGMNAMERef.current.style.color = changeColorFlag(parsedData.pgmnamec);
          CURDATERef.current.style.color = changeColorFlag(parsedData.curdatec);
          AREISDTRef.current.style.color = changeColorFlag(parsedData.areisdtc);

          changeHighlight(ACSADL1Ref, parsedData.acsadl1h);
          changeHighlight(ACSTNUMRef, parsedData.acstnumh);
          changeHighlight(ACSMNAMRef, parsedData.acsmnamh);
          changeHighlight(ACSSTTERef, parsedData.acsstteh);
          changeHighlight(ACSADL2Ref, parsedData.acsadl2h);
          changeHighlight(ACRCYDBRef, parsedData.acrcydbh);
          changeHighlight(ACSTSSNRef, parsedData.acstssnh);
          changeHighlight(AEXPDTRef, parsedData.aexpdth);
          changeHighlight(ACSPHN1Ref, parsedData.acsphn1h);
          changeHighlight(ACSTTUSRef, parsedData.acsttush);
          changeHighlight(ACSTFCORef, parsedData.acstfcoh);
          changeHighlight(ACSPHN2Ref, parsedData.acsphn2h);
          changeHighlight(ACSCTRYRef, parsedData.acsctryh);
          changeHighlight(ACURBALRef, parsedData.acurbalh);
          changeHighlight(ERRMSGRef, parsedData.errmsgh);
          changeHighlight(CURTIMERef, parsedData.curtimeh);
          changeHighlight(ACSZIPCRef, parsedData.acszipch);
          changeHighlight(ADTOPENRef, parsedData.adtopenh);
          changeHighlight(TITLE01Ref, parsedData.title01h);
          changeHighlight(ACSFNAMRef, parsedData.acsfnamh);
          changeHighlight(TITLE02Ref, parsedData.title02h);
          changeHighlight(ACCTSIDRef, parsedData.acctsidh);
          changeHighlight(AADDGRPRef, parsedData.aaddgrph);
          changeHighlight(ACSLNAMRef, parsedData.acslnamh);
          changeHighlight(ACSPFLGRef, parsedData.acspflgh);
          changeHighlight(ACSHLIMRef, parsedData.acshlimh);
          changeHighlight(ACSCITYRef, parsedData.acscityh);
          changeHighlight(ACSGOVTRef, parsedData.acsgovth);
          changeHighlight(ACRDLIMRef, parsedData.acrdlimh);
          changeHighlight(TRNNAMERef, parsedData.trnnameh);
          changeHighlight(INFOMSGRef, parsedData.infomsgh);
          changeHighlight(ACSTDOBRef, parsedData.acstdobh);
          changeHighlight(ACRCYCRRef, parsedData.acrcycrh);
          changeHighlight(ACSEFTCRef, parsedData.acseftch);
          changeHighlight(PGMNAMERef, parsedData.pgmnameh);
          changeHighlight(CURDATERef, parsedData.curdateh);
          changeHighlight(AREISDTRef, parsedData.areisdth);
      }
    },

    request(systemDto, keyCode, serverUrl, history, ACCTSIDRef) {
        if(COACTVW_CACTVWAValidation({  ACCTSID : this.ACCTSID, ACCTSIDRef : ACCTSIDRef, }) === false) {
            return;
        }

        CACTVWAI.errmsgi = this.ERRMSG;
        CACTVWAI.errmsgl = this.ERRMSG.length;
        CACTVWAI.trnnamei = this.TRNNAME;
        CACTVWAI.trnnamel = this.TRNNAME.length;
        CACTVWAI.acctsidi = this.ACCTSID;
        CACTVWAI.acctsidl = this.ACCTSID.length;

        let request = makeJson("userId", convertPressedKey(keyCode));
        request.CACTVWAI = CACTVWAI;
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;
        RestPost(history, request, serverUrl, "COACTVW_CACTVWA");
    },

    simpleRequest(systemDto, keyCode, serverUrl, history) {
        let request = makeJson("userId", convertPressedKey(keyCode));
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;

        console.log("simple request [next tx:]" + request.systemDto.nextTransaction);
        RestPost(history, request, serverUrl, "COACTVW_CACTVWA");
    }
});

export default COACTVW_CACTVWAStore;

