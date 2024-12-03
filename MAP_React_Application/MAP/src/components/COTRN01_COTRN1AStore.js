import React from 'react';
import {observable} from "mobx";
import { COTRN1AI } from "../data/COTRN01_COTRN1AInputDto";
import RestPost from "../runtime/component/io/RestPost";
import {makeJson} from "../runtime/JsonFactory";
import COTRN01_COTRN1AValidation from "./COTRN01_COTRN1AValidation";
import {changeColorFlag, changeHighlight, convertPressedKey} from "../runtime/KeyEvent";

const COTRN01_COTRN1AStore = observable({
      TRNNAME: "",
      TITLE01: "",
      CURDATE: "",
      PGMNAME: "",
      TITLE02: "",
      CURTIME: "",
      TRNIDIN: "",
      TRNID: "",
      CARDNUM: "",
      TTYPCD: "",
      TCATCD: "",
      TRNSRC: "",
      TDESC: "",
      TRNAMT: "",
      TORIGDT: "",
      TPROCDT: "",
      MID: "",
      MNAME: "",
      MCITY: "",
      MZIP: "",
      ERRMSG: "",

      setTRNIDIN(TRNIDIN) {
        this.TRNIDIN = TRNIDIN
      },

    render(parsedData) {
      if (parsedData == null) {
          this.TRNNAME = "";
          this.TITLE01 = "";
          this.CURDATE = "";
          this.PGMNAME = "";
          this.TITLE02 = "";
          this.CURTIME = "";
          this.TRNIDIN = "";
          this.TRNID = "";
          this.CARDNUM = "";
          this.TTYPCD = "";
          this.TCATCD = "";
          this.TRNSRC = "";
          this.TDESC = "";
          this.TRNAMT = "";
          this.TORIGDT = "";
          this.TPROCDT = "";
          this.MID = "";
          this.MNAME = "";
          this.MCITY = "";
          this.MZIP = "";
          this.ERRMSG = "";
      }
        this.MCITY = parsedData.mcityo.trim() === '' ? '' : parsedData.mcityo;
        this.TCATCD = parsedData.tcatcdo.trim() === '' ? '' : parsedData.tcatcdo;
        this.TORIGDT = parsedData.torigdto.trim() === '' ? '' : parsedData.torigdto;
        this.CARDNUM = parsedData.cardnumo.trim() === '' ? '' : parsedData.cardnumo;
        this.TRNAMT = parsedData.trnamto.trim() === '' ? '' : parsedData.trnamto;
        this.MID = parsedData.mido.trim() === '' ? '' : parsedData.mido;
        this.TRNSRC = parsedData.trnsrco.trim() === '' ? '' : parsedData.trnsrco;
        this.TRNID = parsedData.trnido.trim() === '' ? '' : parsedData.trnido;
        this.TPROCDT = parsedData.tprocdto.trim() === '' ? '' : parsedData.tprocdto;
        this.MZIP = parsedData.mzipo.trim() === '' ? '' : parsedData.mzipo;
        this.TRNNAME = parsedData.trnnameo.trim() === '' ? '' : parsedData.trnnameo;
        this.ERRMSG = parsedData.errmsgo.trim() === '' ? '' : parsedData.errmsgo;
        this.CURTIME = parsedData.curtimeo.trim() === '' ? '' : parsedData.curtimeo;
        this.TRNIDIN = parsedData.trnidino.trim() === '' ? '' : parsedData.trnidino;
        this.TTYPCD = parsedData.ttypcdo.trim() === '' ? '' : parsedData.ttypcdo;
        this.TITLE01 = parsedData.title01o.trim() === '' ? '' : parsedData.title01o;
        this.MNAME = parsedData.mnameo.trim() === '' ? '' : parsedData.mnameo;
        this.TITLE02 = parsedData.title02o.trim() === '' ? '' : parsedData.title02o;
        this.TDESC = parsedData.tdesco.trim() === '' ? '' : parsedData.tdesco;
        this.PGMNAME = parsedData.pgmnameo.trim() === '' ? '' : parsedData.pgmnameo;
        this.CURDATE = parsedData.curdateo.trim() === '' ? '' : parsedData.curdateo;
    },

    renderStyle(parsedData, TRNNAMERef , TITLE01Ref , CURDATERef , PGMNAMERef , TITLE02Ref , CURTIMERef , TRNIDINRef , TRNIDRef , CARDNUMRef , TTYPCDRef , TCATCDRef , TRNSRCRef , TDESCRef , TRNAMTRef , TORIGDTRef , TPROCDTRef , MIDRef , MNAMERef , MCITYRef , MZIPRef , ERRMSGRef ) {
      if(parsedData !== null) {
          MCITYRef.current.style.color = changeColorFlag(parsedData.mcityc);
          TCATCDRef.current.style.color = changeColorFlag(parsedData.tcatcdc);
          TORIGDTRef.current.style.color = changeColorFlag(parsedData.torigdtc);
          CARDNUMRef.current.style.color = changeColorFlag(parsedData.cardnumc);
          TRNAMTRef.current.style.color = changeColorFlag(parsedData.trnamtc);
          MIDRef.current.style.color = changeColorFlag(parsedData.midc);
          TRNSRCRef.current.style.color = changeColorFlag(parsedData.trnsrcc);
          TRNIDRef.current.style.color = changeColorFlag(parsedData.trnidc);
          TPROCDTRef.current.style.color = changeColorFlag(parsedData.tprocdtc);
          MZIPRef.current.style.color = changeColorFlag(parsedData.mzipc);
          TRNNAMERef.current.style.color = changeColorFlag(parsedData.trnnamec);
          ERRMSGRef.current.style.color = changeColorFlag(parsedData.errmsgc);
          CURTIMERef.current.style.color = changeColorFlag(parsedData.curtimec);
          TRNIDINRef.current.style.color = changeColorFlag(parsedData.trnidinc);
          TTYPCDRef.current.style.color = changeColorFlag(parsedData.ttypcdc);
          TITLE01Ref.current.style.color = changeColorFlag(parsedData.title01c);
          MNAMERef.current.style.color = changeColorFlag(parsedData.mnamec);
          TITLE02Ref.current.style.color = changeColorFlag(parsedData.title02c);
          TDESCRef.current.style.color = changeColorFlag(parsedData.tdescc);
          PGMNAMERef.current.style.color = changeColorFlag(parsedData.pgmnamec);
          CURDATERef.current.style.color = changeColorFlag(parsedData.curdatec);

          changeHighlight(MCITYRef, parsedData.mcityh);
          changeHighlight(TCATCDRef, parsedData.tcatcdh);
          changeHighlight(TORIGDTRef, parsedData.torigdth);
          changeHighlight(CARDNUMRef, parsedData.cardnumh);
          changeHighlight(TRNAMTRef, parsedData.trnamth);
          changeHighlight(MIDRef, parsedData.midh);
          changeHighlight(TRNSRCRef, parsedData.trnsrch);
          changeHighlight(TRNIDRef, parsedData.trnidh);
          changeHighlight(TPROCDTRef, parsedData.tprocdth);
          changeHighlight(MZIPRef, parsedData.mziph);
          changeHighlight(TRNNAMERef, parsedData.trnnameh);
          changeHighlight(ERRMSGRef, parsedData.errmsgh);
          changeHighlight(CURTIMERef, parsedData.curtimeh);
          changeHighlight(TRNIDINRef, parsedData.trnidinh);
          changeHighlight(TTYPCDRef, parsedData.ttypcdh);
          changeHighlight(TITLE01Ref, parsedData.title01h);
          changeHighlight(MNAMERef, parsedData.mnameh);
          changeHighlight(TITLE02Ref, parsedData.title02h);
          changeHighlight(TDESCRef, parsedData.tdesch);
          changeHighlight(PGMNAMERef, parsedData.pgmnameh);
          changeHighlight(CURDATERef, parsedData.curdateh);
      }
    },

    request(systemDto, keyCode, serverUrl, history, TRNIDINRef) {
        if(COTRN01_COTRN1AValidation({  TRNIDIN : this.TRNIDIN, TRNIDINRef : TRNIDINRef, }) === false) {
            return;
        }

        COTRN1AI.curdatei = this.CURDATE;
        COTRN1AI.curdatel = this.CURDATE.length;
        COTRN1AI.curtimei = this.CURTIME;
        COTRN1AI.curtimel = this.CURTIME.length;
        COTRN1AI.errmsgi = this.ERRMSG;
        COTRN1AI.errmsgl = this.ERRMSG.length;
        COTRN1AI.pgmnamei = this.PGMNAME;
        COTRN1AI.pgmnamel = this.PGMNAME.length;
        COTRN1AI.title01i = this.TITLE01;
        COTRN1AI.title01l = this.TITLE01.length;
        COTRN1AI.title02i = this.TITLE02;
        COTRN1AI.title02l = this.TITLE02.length;
        COTRN1AI.trnnamei = this.TRNNAME;
        COTRN1AI.trnnamel = this.TRNNAME.length;
        COTRN1AI.trnidini = this.TRNIDIN;
        COTRN1AI.trnidinl = this.TRNIDIN.length;

        let request = makeJson("userId", convertPressedKey(keyCode));
        request.COTRN1AI = COTRN1AI;
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;
        RestPost(history, request, serverUrl, "COTRN01_COTRN1A");
    },

    simpleRequest(systemDto, keyCode, serverUrl, history) {
        let request = makeJson("userId", convertPressedKey(keyCode));
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;

        console.log("simple request [next tx:]" + request.systemDto.nextTransaction);
        RestPost(history, request, serverUrl, "COTRN01_COTRN1A");
    }
});

export default COTRN01_COTRN1AStore;

