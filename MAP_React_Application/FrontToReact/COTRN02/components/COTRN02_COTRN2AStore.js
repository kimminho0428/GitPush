import React from 'react';
import {observable} from "mobx";
import { COTRN2AI } from "../data/COTRN02_COTRN2AInputDto";
import RestPost from "../runtime/component/io/RestPost";
import {makeJson} from "../runtime/JsonFactory";
import COTRN02_COTRN2AValidation from "./COTRN02_COTRN2AValidation";
import {changeColorFlag, changeHighlight, convertPressedKey} from "../runtime/KeyEvent";

const COTRN02_COTRN2AStore = observable({
      TRNNAME: "",
      TITLE01: "",
      CURDATE: "",
      PGMNAME: "",
      TITLE02: "",
      CURTIME: "",
      ACTIDIN: "",
      CARDNIN: "",
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
      CONFIRM: "",
      ERRMSG: "",

      setACTIDIN(ACTIDIN) {
        this.ACTIDIN = ACTIDIN
      },
      setCARDNIN(CARDNIN) {
        this.CARDNIN = CARDNIN
      },
      setCONFIRM(CONFIRM) {
        this.CONFIRM = CONFIRM
      },
      setMCITY(MCITY) {
        this.MCITY = MCITY
      },
      setMID(MID) {
        this.MID = MID
      },
      setMNAME(MNAME) {
        this.MNAME = MNAME
      },
      setMZIP(MZIP) {
        this.MZIP = MZIP
      },
      setTCATCD(TCATCD) {
        this.TCATCD = TCATCD
      },
      setTDESC(TDESC) {
        this.TDESC = TDESC
      },
      setTORIGDT(TORIGDT) {
        this.TORIGDT = TORIGDT
      },
      setTPROCDT(TPROCDT) {
        this.TPROCDT = TPROCDT
      },
      setTRNAMT(TRNAMT) {
        this.TRNAMT = TRNAMT
      },
      setTRNSRC(TRNSRC) {
        this.TRNSRC = TRNSRC
      },
      setTTYPCD(TTYPCD) {
        this.TTYPCD = TTYPCD
      },

    render(parsedData) {
      if (parsedData == null) {
          this.TRNNAME = "";
          this.TITLE01 = "";
          this.CURDATE = "";
          this.PGMNAME = "";
          this.TITLE02 = "";
          this.CURTIME = "";
          this.ACTIDIN = "";
          this.CARDNIN = "";
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
          this.CONFIRM = "";
          this.ERRMSG = "";
      }
        this.MCITY = parsedData.mcityo.trim() === '' ? '' : parsedData.mcityo;
        this.TCATCD = parsedData.tcatcdo.trim() === '' ? '' : parsedData.tcatcdo;
        this.TORIGDT = parsedData.torigdto.trim() === '' ? '' : parsedData.torigdto;
        this.TRNAMT = parsedData.trnamto.trim() === '' ? '' : parsedData.trnamto;
        this.MID = parsedData.mido.trim() === '' ? '' : parsedData.mido;
        this.TRNSRC = parsedData.trnsrco.trim() === '' ? '' : parsedData.trnsrco;
        this.TPROCDT = parsedData.tprocdto.trim() === '' ? '' : parsedData.tprocdto;
        this.MZIP = parsedData.mzipo.trim() === '' ? '' : parsedData.mzipo;
        this.TRNNAME = parsedData.trnnameo.trim() === '' ? '' : parsedData.trnnameo;
        this.CARDNIN = parsedData.cardnino.trim() === '' ? '' : parsedData.cardnino;
        this.ERRMSG = parsedData.errmsgo.trim() === '' ? '' : parsedData.errmsgo;
        this.CURTIME = parsedData.curtimeo.trim() === '' ? '' : parsedData.curtimeo;
        this.TTYPCD = parsedData.ttypcdo.trim() === '' ? '' : parsedData.ttypcdo;
        this.TITLE01 = parsedData.title01o.trim() === '' ? '' : parsedData.title01o;
        this.ACTIDIN = parsedData.actidino.trim() === '' ? '' : parsedData.actidino;
        this.MNAME = parsedData.mnameo.trim() === '' ? '' : parsedData.mnameo;
        this.TITLE02 = parsedData.title02o.trim() === '' ? '' : parsedData.title02o;
        this.TDESC = parsedData.tdesco.trim() === '' ? '' : parsedData.tdesco;
        this.CONFIRM = parsedData.confirmo.trim() === '' ? '' : parsedData.confirmo;
        this.PGMNAME = parsedData.pgmnameo.trim() === '' ? '' : parsedData.pgmnameo;
        this.CURDATE = parsedData.curdateo.trim() === '' ? '' : parsedData.curdateo;
    },

    renderStyle(parsedData, TRNNAMERef , TITLE01Ref , CURDATERef , PGMNAMERef , TITLE02Ref , CURTIMERef , ACTIDINRef , CARDNINRef , TTYPCDRef , TCATCDRef , TRNSRCRef , TDESCRef , TRNAMTRef , TORIGDTRef , TPROCDTRef , MIDRef , MNAMERef , MCITYRef , MZIPRef , CONFIRMRef , ERRMSGRef ) {
      if(parsedData !== null) {
          MCITYRef.current.style.color = changeColorFlag(parsedData.mcityc);
          TCATCDRef.current.style.color = changeColorFlag(parsedData.tcatcdc);
          TORIGDTRef.current.style.color = changeColorFlag(parsedData.torigdtc);
          TRNAMTRef.current.style.color = changeColorFlag(parsedData.trnamtc);
          MIDRef.current.style.color = changeColorFlag(parsedData.midc);
          TRNSRCRef.current.style.color = changeColorFlag(parsedData.trnsrcc);
          TPROCDTRef.current.style.color = changeColorFlag(parsedData.tprocdtc);
          MZIPRef.current.style.color = changeColorFlag(parsedData.mzipc);
          TRNNAMERef.current.style.color = changeColorFlag(parsedData.trnnamec);
          CARDNINRef.current.style.color = changeColorFlag(parsedData.cardninc);
          ERRMSGRef.current.style.color = changeColorFlag(parsedData.errmsgc);
          CURTIMERef.current.style.color = changeColorFlag(parsedData.curtimec);
          TTYPCDRef.current.style.color = changeColorFlag(parsedData.ttypcdc);
          TITLE01Ref.current.style.color = changeColorFlag(parsedData.title01c);
          ACTIDINRef.current.style.color = changeColorFlag(parsedData.actidinc);
          MNAMERef.current.style.color = changeColorFlag(parsedData.mnamec);
          TITLE02Ref.current.style.color = changeColorFlag(parsedData.title02c);
          TDESCRef.current.style.color = changeColorFlag(parsedData.tdescc);
          CONFIRMRef.current.style.color = changeColorFlag(parsedData.confirmc);
          PGMNAMERef.current.style.color = changeColorFlag(parsedData.pgmnamec);
          CURDATERef.current.style.color = changeColorFlag(parsedData.curdatec);

          changeHighlight(MCITYRef, parsedData.mcityh);
          changeHighlight(TCATCDRef, parsedData.tcatcdh);
          changeHighlight(TORIGDTRef, parsedData.torigdth);
          changeHighlight(TRNAMTRef, parsedData.trnamth);
          changeHighlight(MIDRef, parsedData.midh);
          changeHighlight(TRNSRCRef, parsedData.trnsrch);
          changeHighlight(TPROCDTRef, parsedData.tprocdth);
          changeHighlight(MZIPRef, parsedData.mziph);
          changeHighlight(TRNNAMERef, parsedData.trnnameh);
          changeHighlight(CARDNINRef, parsedData.cardninh);
          changeHighlight(ERRMSGRef, parsedData.errmsgh);
          changeHighlight(CURTIMERef, parsedData.curtimeh);
          changeHighlight(TTYPCDRef, parsedData.ttypcdh);
          changeHighlight(TITLE01Ref, parsedData.title01h);
          changeHighlight(ACTIDINRef, parsedData.actidinh);
          changeHighlight(MNAMERef, parsedData.mnameh);
          changeHighlight(TITLE02Ref, parsedData.title02h);
          changeHighlight(TDESCRef, parsedData.tdesch);
          changeHighlight(CONFIRMRef, parsedData.confirmh);
          changeHighlight(PGMNAMERef, parsedData.pgmnameh);
          changeHighlight(CURDATERef, parsedData.curdateh);
      }
    },

    request(systemDto, keyCode, serverUrl, history, ACTIDINRef, CARDNINRef, CONFIRMRef, MCITYRef, MIDRef, MNAMERef, MZIPRef, TCATCDRef, TDESCRef, TORIGDTRef, TPROCDTRef, TRNAMTRef, TRNSRCRef, TTYPCDRef) {
        if(COTRN02_COTRN2AValidation({  ACTIDIN : this.ACTIDIN, ACTIDINRef : ACTIDINRef, CARDNIN : this.CARDNIN, CARDNINRef : CARDNINRef, CONFIRM : this.CONFIRM, CONFIRMRef : CONFIRMRef, MCITY : this.MCITY, MCITYRef : MCITYRef, MID : this.MID, MIDRef : MIDRef, MNAME : this.MNAME, MNAMERef : MNAMERef, MZIP : this.MZIP, MZIPRef : MZIPRef, TCATCD : this.TCATCD, TCATCDRef : TCATCDRef, TDESC : this.TDESC, TDESCRef : TDESCRef, TORIGDT : this.TORIGDT, TORIGDTRef : TORIGDTRef, TPROCDT : this.TPROCDT, TPROCDTRef : TPROCDTRef, TRNAMT : this.TRNAMT, TRNAMTRef : TRNAMTRef, TRNSRC : this.TRNSRC, TRNSRCRef : TRNSRCRef, TTYPCD : this.TTYPCD, TTYPCDRef : TTYPCDRef, }) === false) {
            return;
        }

        COTRN2AI.curdatei = this.CURDATE;
        COTRN2AI.curdatel = this.CURDATE.length;
        COTRN2AI.curtimei = this.CURTIME;
        COTRN2AI.curtimel = this.CURTIME.length;
        COTRN2AI.errmsgi = this.ERRMSG;
        COTRN2AI.errmsgl = this.ERRMSG.length;
        COTRN2AI.pgmnamei = this.PGMNAME;
        COTRN2AI.pgmnamel = this.PGMNAME.length;
        COTRN2AI.title01i = this.TITLE01;
        COTRN2AI.title01l = this.TITLE01.length;
        COTRN2AI.title02i = this.TITLE02;
        COTRN2AI.title02l = this.TITLE02.length;
        COTRN2AI.trnnamei = this.TRNNAME;
        COTRN2AI.trnnamel = this.TRNNAME.length;
        COTRN2AI.actidini = this.ACTIDIN;
        COTRN2AI.actidinl = this.ACTIDIN.length;
        COTRN2AI.cardnini = this.CARDNIN;
        COTRN2AI.cardninl = this.CARDNIN.length;
        COTRN2AI.confirmi = this.CONFIRM;
        COTRN2AI.confirml = this.CONFIRM.length;
        COTRN2AI.mcityi = this.MCITY;
        COTRN2AI.mcityl = this.MCITY.length;
        COTRN2AI.midi = this.MID;
        COTRN2AI.midl = this.MID.length;
        COTRN2AI.mnamei = this.MNAME;
        COTRN2AI.mnamel = this.MNAME.length;
        COTRN2AI.mzipi = this.MZIP;
        COTRN2AI.mzipl = this.MZIP.length;
        COTRN2AI.tcatcdi = this.TCATCD;
        COTRN2AI.tcatcdl = this.TCATCD.length;
        COTRN2AI.tdesci = this.TDESC;
        COTRN2AI.tdescl = this.TDESC.length;
        COTRN2AI.torigdti = this.TORIGDT;
        COTRN2AI.torigdtl = this.TORIGDT.length;
        COTRN2AI.tprocdti = this.TPROCDT;
        COTRN2AI.tprocdtl = this.TPROCDT.length;
        COTRN2AI.trnamti = this.TRNAMT;
        COTRN2AI.trnamtl = this.TRNAMT.length;
        COTRN2AI.trnsrci = this.TRNSRC;
        COTRN2AI.trnsrcl = this.TRNSRC.length;
        COTRN2AI.ttypcdi = this.TTYPCD;
        COTRN2AI.ttypcdl = this.TTYPCD.length;

        let request = makeJson("userId", convertPressedKey(keyCode));
        request.COTRN2AI = COTRN2AI;
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;
        RestPost(history, request, serverUrl, "COTRN02_COTRN2A");
    },

    simpleRequest(systemDto, keyCode, serverUrl, history) {
        let request = makeJson("userId", convertPressedKey(keyCode));
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;

        console.log("simple request [next tx:]" + request.systemDto.nextTransaction);
        RestPost(history, request, serverUrl, "COTRN02_COTRN2A");
    }
});

export default COTRN02_COTRN2AStore;

