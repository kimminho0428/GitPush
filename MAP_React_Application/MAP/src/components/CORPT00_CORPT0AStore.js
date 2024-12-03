import React from 'react';
import {observable} from "mobx";
import { CORPT0AI } from "../data/CORPT00_CORPT0AInputDto";
import RestPost from "../runtime/component/io/RestPost";
import {makeJson} from "../runtime/JsonFactory";
import CORPT00_CORPT0AValidation from "./CORPT00_CORPT0AValidation";
import {changeColorFlag, changeHighlight, convertPressedKey} from "../runtime/KeyEvent";

const CORPT00_CORPT0AStore = observable({
      TRNNAME: "",
      TITLE01: "",
      CURDATE: "",
      PGMNAME: "",
      TITLE02: "",
      CURTIME: "",
      MONTHLY: "",
      YEARLY: "",
      CUSTOM: "",
      SDTMM: "",
      SDTDD: "",
      SDTYYYY: "",
      EDTMM: "",
      EDTDD: "",
      EDTYYYY: "",
      CONFIRM: "",
      ERRMSG: "",

      setCONFIRM(CONFIRM) {
        this.CONFIRM = CONFIRM
      },
      setCUSTOM(CUSTOM) {
        this.CUSTOM = CUSTOM
      },
      setEDTDD(EDTDD) {
        this.EDTDD = EDTDD
      },
      setEDTMM(EDTMM) {
        this.EDTMM = EDTMM
      },
      setEDTYYYY(EDTYYYY) {
        this.EDTYYYY = EDTYYYY
      },
      setMONTHLY(MONTHLY) {
        this.MONTHLY = MONTHLY
      },
      setSDTDD(SDTDD) {
        this.SDTDD = SDTDD
      },
      setSDTMM(SDTMM) {
        this.SDTMM = SDTMM
      },
      setSDTYYYY(SDTYYYY) {
        this.SDTYYYY = SDTYYYY
      },
      setYEARLY(YEARLY) {
        this.YEARLY = YEARLY
      },

    render(parsedData) {
      if (parsedData == null) {
          this.TRNNAME = "";
          this.TITLE01 = "";
          this.CURDATE = "";
          this.PGMNAME = "";
          this.TITLE02 = "";
          this.CURTIME = "";
          this.MONTHLY = "";
          this.YEARLY = "";
          this.CUSTOM = "";
          this.SDTMM = "";
          this.SDTDD = "";
          this.SDTYYYY = "";
          this.EDTMM = "";
          this.EDTDD = "";
          this.EDTYYYY = "";
          this.CONFIRM = "";
          this.ERRMSG = "";
      }
        this.YEARLY = parsedData.yearlyo.trim() === '' ? '' : parsedData.yearlyo;
        this.MONTHLY = parsedData.monthlyo.trim() === '' ? '' : parsedData.monthlyo;
        this.SDTMM = parsedData.sdtmmo.trim() === '' ? '' : parsedData.sdtmmo;
        this.SDTDD = parsedData.sdtddo.trim() === '' ? '' : parsedData.sdtddo;
        this.TRNNAME = parsedData.trnnameo.trim() === '' ? '' : parsedData.trnnameo;
        this.EDTYYYY = parsedData.edtyyyyo.trim() === '' ? '' : parsedData.edtyyyyo;
        this.ERRMSG = parsedData.errmsgo.trim() === '' ? '' : parsedData.errmsgo;
        this.CURTIME = parsedData.curtimeo.trim() === '' ? '' : parsedData.curtimeo;
        this.CUSTOM = parsedData.customo.trim() === '' ? '' : parsedData.customo;
        this.TITLE01 = parsedData.title01o.trim() === '' ? '' : parsedData.title01o;
        this.EDTMM = parsedData.edtmmo.trim() === '' ? '' : parsedData.edtmmo;
        this.EDTDD = parsedData.edtddo.trim() === '' ? '' : parsedData.edtddo;
        this.TITLE02 = parsedData.title02o.trim() === '' ? '' : parsedData.title02o;
        this.SDTYYYY = parsedData.sdtyyyyo.trim() === '' ? '' : parsedData.sdtyyyyo;
        this.CONFIRM = parsedData.confirmo.trim() === '' ? '' : parsedData.confirmo;
        this.PGMNAME = parsedData.pgmnameo.trim() === '' ? '' : parsedData.pgmnameo;
        this.CURDATE = parsedData.curdateo.trim() === '' ? '' : parsedData.curdateo;
    },

    renderStyle(parsedData, TRNNAMERef , TITLE01Ref , CURDATERef , PGMNAMERef , TITLE02Ref , CURTIMERef , MONTHLYRef , YEARLYRef , CUSTOMRef , SDTMMRef , SDTDDRef , SDTYYYYRef , EDTMMRef , EDTDDRef , EDTYYYYRef , CONFIRMRef , ERRMSGRef ) {
      if(parsedData !== null) {
          YEARLYRef.current.style.color = changeColorFlag(parsedData.yearlyc);
          MONTHLYRef.current.style.color = changeColorFlag(parsedData.monthlyc);
          SDTMMRef.current.style.color = changeColorFlag(parsedData.sdtmmc);
          SDTDDRef.current.style.color = changeColorFlag(parsedData.sdtddc);
          TRNNAMERef.current.style.color = changeColorFlag(parsedData.trnnamec);
          EDTYYYYRef.current.style.color = changeColorFlag(parsedData.edtyyyyc);
          ERRMSGRef.current.style.color = changeColorFlag(parsedData.errmsgc);
          CURTIMERef.current.style.color = changeColorFlag(parsedData.curtimec);
          CUSTOMRef.current.style.color = changeColorFlag(parsedData.customc);
          TITLE01Ref.current.style.color = changeColorFlag(parsedData.title01c);
          EDTMMRef.current.style.color = changeColorFlag(parsedData.edtmmc);
          EDTDDRef.current.style.color = changeColorFlag(parsedData.edtddc);
          TITLE02Ref.current.style.color = changeColorFlag(parsedData.title02c);
          SDTYYYYRef.current.style.color = changeColorFlag(parsedData.sdtyyyyc);
          CONFIRMRef.current.style.color = changeColorFlag(parsedData.confirmc);
          PGMNAMERef.current.style.color = changeColorFlag(parsedData.pgmnamec);
          CURDATERef.current.style.color = changeColorFlag(parsedData.curdatec);

          changeHighlight(YEARLYRef, parsedData.yearlyh);
          changeHighlight(MONTHLYRef, parsedData.monthlyh);
          changeHighlight(SDTMMRef, parsedData.sdtmmh);
          changeHighlight(SDTDDRef, parsedData.sdtddh);
          changeHighlight(TRNNAMERef, parsedData.trnnameh);
          changeHighlight(EDTYYYYRef, parsedData.edtyyyyh);
          changeHighlight(ERRMSGRef, parsedData.errmsgh);
          changeHighlight(CURTIMERef, parsedData.curtimeh);
          changeHighlight(CUSTOMRef, parsedData.customh);
          changeHighlight(TITLE01Ref, parsedData.title01h);
          changeHighlight(EDTMMRef, parsedData.edtmmh);
          changeHighlight(EDTDDRef, parsedData.edtddh);
          changeHighlight(TITLE02Ref, parsedData.title02h);
          changeHighlight(SDTYYYYRef, parsedData.sdtyyyyh);
          changeHighlight(CONFIRMRef, parsedData.confirmh);
          changeHighlight(PGMNAMERef, parsedData.pgmnameh);
          changeHighlight(CURDATERef, parsedData.curdateh);
      }
    },

    request(systemDto, keyCode, serverUrl, history, CONFIRMRef, CUSTOMRef, EDTDDRef, EDTMMRef, EDTYYYYRef, MONTHLYRef, SDTDDRef, SDTMMRef, SDTYYYYRef, YEARLYRef) {
        if(CORPT00_CORPT0AValidation({  CONFIRM : this.CONFIRM, CONFIRMRef : CONFIRMRef, CUSTOM : this.CUSTOM, CUSTOMRef : CUSTOMRef, EDTDD : this.EDTDD, EDTDDRef : EDTDDRef, EDTMM : this.EDTMM, EDTMMRef : EDTMMRef, EDTYYYY : this.EDTYYYY, EDTYYYYRef : EDTYYYYRef, MONTHLY : this.MONTHLY, MONTHLYRef : MONTHLYRef, SDTDD : this.SDTDD, SDTDDRef : SDTDDRef, SDTMM : this.SDTMM, SDTMMRef : SDTMMRef, SDTYYYY : this.SDTYYYY, SDTYYYYRef : SDTYYYYRef, YEARLY : this.YEARLY, YEARLYRef : YEARLYRef, }) === false) {
            return;
        }

        CORPT0AI.curdatei = this.CURDATE;
        CORPT0AI.curdatel = this.CURDATE.length;
        CORPT0AI.curtimei = this.CURTIME;
        CORPT0AI.curtimel = this.CURTIME.length;
        CORPT0AI.errmsgi = this.ERRMSG;
        CORPT0AI.errmsgl = this.ERRMSG.length;
        CORPT0AI.pgmnamei = this.PGMNAME;
        CORPT0AI.pgmnamel = this.PGMNAME.length;
        CORPT0AI.title01i = this.TITLE01;
        CORPT0AI.title01l = this.TITLE01.length;
        CORPT0AI.title02i = this.TITLE02;
        CORPT0AI.title02l = this.TITLE02.length;
        CORPT0AI.trnnamei = this.TRNNAME;
        CORPT0AI.trnnamel = this.TRNNAME.length;
        CORPT0AI.confirmi = this.CONFIRM;
        CORPT0AI.confirml = this.CONFIRM.length;
        CORPT0AI.customi = this.CUSTOM;
        CORPT0AI.customl = this.CUSTOM.length;
        CORPT0AI.edtddi = this.EDTDD;
        CORPT0AI.edtddl = this.EDTDD.length;
        CORPT0AI.edtmmi = this.EDTMM;
        CORPT0AI.edtmml = this.EDTMM.length;
        CORPT0AI.edtyyyyi = this.EDTYYYY;
        CORPT0AI.edtyyyyl = this.EDTYYYY.length;
        CORPT0AI.monthlyi = this.MONTHLY;
        CORPT0AI.monthlyl = this.MONTHLY.length;
        CORPT0AI.sdtddi = this.SDTDD;
        CORPT0AI.sdtddl = this.SDTDD.length;
        CORPT0AI.sdtmmi = this.SDTMM;
        CORPT0AI.sdtmml = this.SDTMM.length;
        CORPT0AI.sdtyyyyi = this.SDTYYYY;
        CORPT0AI.sdtyyyyl = this.SDTYYYY.length;
        CORPT0AI.yearlyi = this.YEARLY;
        CORPT0AI.yearlyl = this.YEARLY.length;

        let request = makeJson("userId", convertPressedKey(keyCode));
        request.CORPT0AI = CORPT0AI;
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;
        RestPost(history, request, serverUrl, "CORPT00_CORPT0A");
    },

    simpleRequest(systemDto, keyCode, serverUrl, history) {
        let request = makeJson("userId", convertPressedKey(keyCode));
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;

        console.log("simple request [next tx:]" + request.systemDto.nextTransaction);
        RestPost(history, request, serverUrl, "CORPT00_CORPT0A");
    }
});

export default CORPT00_CORPT0AStore;

