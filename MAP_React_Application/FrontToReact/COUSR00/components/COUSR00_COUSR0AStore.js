import React from 'react';
import {observable} from "mobx";
import { COUSR0AI } from "../data/COUSR00_COUSR0AInputDto";
import RestPost from "../runtime/component/io/RestPost";
import {makeJson} from "../runtime/JsonFactory";
import COUSR00_COUSR0AValidation from "./COUSR00_COUSR0AValidation";
import {changeColorFlag, changeHighlight, convertPressedKey} from "../runtime/KeyEvent";

const COUSR00_COUSR0AStore = observable({
      TRNNAME: "",
      TITLE01: "",
      CURDATE: "",
      PGMNAME: "",
      TITLE02: "",
      CURTIME: "",
      PAGENUM: "",
      USRIDIN: "",
      SEL0001: "",
      USRID01: "",
      FNAME01: "",
      LNAME01: "",
      UTYPE01: "",
      SEL0002: "",
      USRID02: "",
      FNAME02: "",
      LNAME02: "",
      UTYPE02: "",
      SEL0003: "",
      USRID03: "",
      FNAME03: "",
      LNAME03: "",
      UTYPE03: "",
      SEL0004: "",
      USRID04: "",
      FNAME04: "",
      LNAME04: "",
      UTYPE04: "",
      SEL0005: "",
      USRID05: "",
      FNAME05: "",
      LNAME05: "",
      UTYPE05: "",
      SEL0006: "",
      USRID06: "",
      FNAME06: "",
      LNAME06: "",
      UTYPE06: "",
      SEL0007: "",
      USRID07: "",
      FNAME07: "",
      LNAME07: "",
      UTYPE07: "",
      SEL0008: "",
      USRID08: "",
      FNAME08: "",
      LNAME08: "",
      UTYPE08: "",
      SEL0009: "",
      USRID09: "",
      FNAME09: "",
      LNAME09: "",
      UTYPE09: "",
      SEL0010: "",
      USRID10: "",
      FNAME10: "",
      LNAME10: "",
      UTYPE10: "",
      ERRMSG: "",

      setSEL0001(SEL0001) {
        this.SEL0001 = SEL0001
      },
      setSEL0002(SEL0002) {
        this.SEL0002 = SEL0002
      },
      setSEL0003(SEL0003) {
        this.SEL0003 = SEL0003
      },
      setSEL0004(SEL0004) {
        this.SEL0004 = SEL0004
      },
      setSEL0005(SEL0005) {
        this.SEL0005 = SEL0005
      },
      setSEL0006(SEL0006) {
        this.SEL0006 = SEL0006
      },
      setSEL0007(SEL0007) {
        this.SEL0007 = SEL0007
      },
      setSEL0008(SEL0008) {
        this.SEL0008 = SEL0008
      },
      setSEL0009(SEL0009) {
        this.SEL0009 = SEL0009
      },
      setSEL0010(SEL0010) {
        this.SEL0010 = SEL0010
      },
      setUSRIDIN(USRIDIN) {
        this.USRIDIN = USRIDIN
      },

    render(parsedData) {
      if (parsedData == null) {
          this.TRNNAME = "";
          this.TITLE01 = "";
          this.CURDATE = "";
          this.PGMNAME = "";
          this.TITLE02 = "";
          this.CURTIME = "";
          this.PAGENUM = "";
          this.USRIDIN = "";
          this.SEL0001 = "";
          this.USRID01 = "";
          this.FNAME01 = "";
          this.LNAME01 = "";
          this.UTYPE01 = "";
          this.SEL0002 = "";
          this.USRID02 = "";
          this.FNAME02 = "";
          this.LNAME02 = "";
          this.UTYPE02 = "";
          this.SEL0003 = "";
          this.USRID03 = "";
          this.FNAME03 = "";
          this.LNAME03 = "";
          this.UTYPE03 = "";
          this.SEL0004 = "";
          this.USRID04 = "";
          this.FNAME04 = "";
          this.LNAME04 = "";
          this.UTYPE04 = "";
          this.SEL0005 = "";
          this.USRID05 = "";
          this.FNAME05 = "";
          this.LNAME05 = "";
          this.UTYPE05 = "";
          this.SEL0006 = "";
          this.USRID06 = "";
          this.FNAME06 = "";
          this.LNAME06 = "";
          this.UTYPE06 = "";
          this.SEL0007 = "";
          this.USRID07 = "";
          this.FNAME07 = "";
          this.LNAME07 = "";
          this.UTYPE07 = "";
          this.SEL0008 = "";
          this.USRID08 = "";
          this.FNAME08 = "";
          this.LNAME08 = "";
          this.UTYPE08 = "";
          this.SEL0009 = "";
          this.USRID09 = "";
          this.FNAME09 = "";
          this.LNAME09 = "";
          this.UTYPE09 = "";
          this.SEL0010 = "";
          this.USRID10 = "";
          this.FNAME10 = "";
          this.LNAME10 = "";
          this.UTYPE10 = "";
          this.ERRMSG = "";
      }
        this.UTYPE05 = parsedData.utype05o.trim() === '' ? '' : parsedData.utype05o;
        this.UTYPE06 = parsedData.utype06o.trim() === '' ? '' : parsedData.utype06o;
        this.UTYPE07 = parsedData.utype07o.trim() === '' ? '' : parsedData.utype07o;
        this.UTYPE08 = parsedData.utype08o.trim() === '' ? '' : parsedData.utype08o;
        this.UTYPE01 = parsedData.utype01o.trim() === '' ? '' : parsedData.utype01o;
        this.UTYPE02 = parsedData.utype02o.trim() === '' ? '' : parsedData.utype02o;
        this.UTYPE03 = parsedData.utype03o.trim() === '' ? '' : parsedData.utype03o;
        this.UTYPE04 = parsedData.utype04o.trim() === '' ? '' : parsedData.utype04o;
        this.LNAME09 = parsedData.lname09o.trim() === '' ? '' : parsedData.lname09o;
        this.UTYPE09 = parsedData.utype09o.trim() === '' ? '' : parsedData.utype09o;
        this.PAGENUM = parsedData.pagenumo.trim() === '' ? '' : parsedData.pagenumo;
        this.SEL0001 = parsedData.sel0001o.trim() === '' ? '' : parsedData.sel0001o;
        this.SEL0003 = parsedData.sel0003o.trim() === '' ? '' : parsedData.sel0003o;
        this.ERRMSG = parsedData.errmsgo.trim() === '' ? '' : parsedData.errmsgo;
        this.CURTIME = parsedData.curtimeo.trim() === '' ? '' : parsedData.curtimeo;
        this.SEL0002 = parsedData.sel0002o.trim() === '' ? '' : parsedData.sel0002o;
        this.SEL0005 = parsedData.sel0005o.trim() === '' ? '' : parsedData.sel0005o;
        this.SEL0004 = parsedData.sel0004o.trim() === '' ? '' : parsedData.sel0004o;
        this.LNAME10 = parsedData.lname10o.trim() === '' ? '' : parsedData.lname10o;
        this.LNAME04 = parsedData.lname04o.trim() === '' ? '' : parsedData.lname04o;
        this.LNAME03 = parsedData.lname03o.trim() === '' ? '' : parsedData.lname03o;
        this.LNAME02 = parsedData.lname02o.trim() === '' ? '' : parsedData.lname02o;
        this.LNAME01 = parsedData.lname01o.trim() === '' ? '' : parsedData.lname01o;
        this.LNAME08 = parsedData.lname08o.trim() === '' ? '' : parsedData.lname08o;
        this.LNAME07 = parsedData.lname07o.trim() === '' ? '' : parsedData.lname07o;
        this.LNAME06 = parsedData.lname06o.trim() === '' ? '' : parsedData.lname06o;
        this.LNAME05 = parsedData.lname05o.trim() === '' ? '' : parsedData.lname05o;
        this.UTYPE10 = parsedData.utype10o.trim() === '' ? '' : parsedData.utype10o;
        this.PGMNAME = parsedData.pgmnameo.trim() === '' ? '' : parsedData.pgmnameo;
        this.CURDATE = parsedData.curdateo.trim() === '' ? '' : parsedData.curdateo;
        this.USRIDIN = parsedData.usridino.trim() === '' ? '' : parsedData.usridino;
        this.FNAME05 = parsedData.fname05o.trim() === '' ? '' : parsedData.fname05o;
        this.FNAME06 = parsedData.fname06o.trim() === '' ? '' : parsedData.fname06o;
        this.FNAME03 = parsedData.fname03o.trim() === '' ? '' : parsedData.fname03o;
        this.FNAME04 = parsedData.fname04o.trim() === '' ? '' : parsedData.fname04o;
        this.FNAME01 = parsedData.fname01o.trim() === '' ? '' : parsedData.fname01o;
        this.FNAME02 = parsedData.fname02o.trim() === '' ? '' : parsedData.fname02o;
        this.USRID10 = parsedData.usrid10o.trim() === '' ? '' : parsedData.usrid10o;
        this.TITLE01 = parsedData.title01o.trim() === '' ? '' : parsedData.title01o;
        this.TITLE02 = parsedData.title02o.trim() === '' ? '' : parsedData.title02o;
        this.FNAME09 = parsedData.fname09o.trim() === '' ? '' : parsedData.fname09o;
        this.FNAME07 = parsedData.fname07o.trim() === '' ? '' : parsedData.fname07o;
        this.FNAME08 = parsedData.fname08o.trim() === '' ? '' : parsedData.fname08o;
        this.USRID09 = parsedData.usrid09o.trim() === '' ? '' : parsedData.usrid09o;
        this.USRID02 = parsedData.usrid02o.trim() === '' ? '' : parsedData.usrid02o;
        this.SEL0007 = parsedData.sel0007o.trim() === '' ? '' : parsedData.sel0007o;
        this.USRID01 = parsedData.usrid01o.trim() === '' ? '' : parsedData.usrid01o;
        this.SEL0006 = parsedData.sel0006o.trim() === '' ? '' : parsedData.sel0006o;
        this.USRID04 = parsedData.usrid04o.trim() === '' ? '' : parsedData.usrid04o;
        this.SEL0009 = parsedData.sel0009o.trim() === '' ? '' : parsedData.sel0009o;
        this.USRID03 = parsedData.usrid03o.trim() === '' ? '' : parsedData.usrid03o;
        this.SEL0008 = parsedData.sel0008o.trim() === '' ? '' : parsedData.sel0008o;
        this.USRID06 = parsedData.usrid06o.trim() === '' ? '' : parsedData.usrid06o;
        this.USRID05 = parsedData.usrid05o.trim() === '' ? '' : parsedData.usrid05o;
        this.USRID08 = parsedData.usrid08o.trim() === '' ? '' : parsedData.usrid08o;
        this.USRID07 = parsedData.usrid07o.trim() === '' ? '' : parsedData.usrid07o;
        this.SEL0010 = parsedData.sel0010o.trim() === '' ? '' : parsedData.sel0010o;
        this.TRNNAME = parsedData.trnnameo.trim() === '' ? '' : parsedData.trnnameo;
        this.FNAME10 = parsedData.fname10o.trim() === '' ? '' : parsedData.fname10o;
    },

    renderStyle(parsedData, TRNNAMERef , TITLE01Ref , CURDATERef , PGMNAMERef , TITLE02Ref , CURTIMERef , PAGENUMRef , USRIDINRef , SEL0001Ref , USRID01Ref , FNAME01Ref , LNAME01Ref , UTYPE01Ref , SEL0002Ref , USRID02Ref , FNAME02Ref , LNAME02Ref , UTYPE02Ref , SEL0003Ref , USRID03Ref , FNAME03Ref , LNAME03Ref , UTYPE03Ref , SEL0004Ref , USRID04Ref , FNAME04Ref , LNAME04Ref , UTYPE04Ref , SEL0005Ref , USRID05Ref , FNAME05Ref , LNAME05Ref , UTYPE05Ref , SEL0006Ref , USRID06Ref , FNAME06Ref , LNAME06Ref , UTYPE06Ref , SEL0007Ref , USRID07Ref , FNAME07Ref , LNAME07Ref , UTYPE07Ref , SEL0008Ref , USRID08Ref , FNAME08Ref , LNAME08Ref , UTYPE08Ref , SEL0009Ref , USRID09Ref , FNAME09Ref , LNAME09Ref , UTYPE09Ref , SEL0010Ref , USRID10Ref , FNAME10Ref , LNAME10Ref , UTYPE10Ref , ERRMSGRef ) {
      if(parsedData !== null) {
          UTYPE05Ref.current.style.color = changeColorFlag(parsedData.utype05c);
          UTYPE06Ref.current.style.color = changeColorFlag(parsedData.utype06c);
          UTYPE07Ref.current.style.color = changeColorFlag(parsedData.utype07c);
          UTYPE08Ref.current.style.color = changeColorFlag(parsedData.utype08c);
          UTYPE01Ref.current.style.color = changeColorFlag(parsedData.utype01c);
          UTYPE02Ref.current.style.color = changeColorFlag(parsedData.utype02c);
          UTYPE03Ref.current.style.color = changeColorFlag(parsedData.utype03c);
          UTYPE04Ref.current.style.color = changeColorFlag(parsedData.utype04c);
          LNAME09Ref.current.style.color = changeColorFlag(parsedData.lname09c);
          UTYPE09Ref.current.style.color = changeColorFlag(parsedData.utype09c);
          PAGENUMRef.current.style.color = changeColorFlag(parsedData.pagenumc);
          SEL0001Ref.current.style.color = changeColorFlag(parsedData.sel0001c);
          SEL0003Ref.current.style.color = changeColorFlag(parsedData.sel0003c);
          ERRMSGRef.current.style.color = changeColorFlag(parsedData.errmsgc);
          CURTIMERef.current.style.color = changeColorFlag(parsedData.curtimec);
          SEL0002Ref.current.style.color = changeColorFlag(parsedData.sel0002c);
          SEL0005Ref.current.style.color = changeColorFlag(parsedData.sel0005c);
          SEL0004Ref.current.style.color = changeColorFlag(parsedData.sel0004c);
          LNAME10Ref.current.style.color = changeColorFlag(parsedData.lname10c);
          LNAME04Ref.current.style.color = changeColorFlag(parsedData.lname04c);
          LNAME03Ref.current.style.color = changeColorFlag(parsedData.lname03c);
          LNAME02Ref.current.style.color = changeColorFlag(parsedData.lname02c);
          LNAME01Ref.current.style.color = changeColorFlag(parsedData.lname01c);
          LNAME08Ref.current.style.color = changeColorFlag(parsedData.lname08c);
          LNAME07Ref.current.style.color = changeColorFlag(parsedData.lname07c);
          LNAME06Ref.current.style.color = changeColorFlag(parsedData.lname06c);
          LNAME05Ref.current.style.color = changeColorFlag(parsedData.lname05c);
          UTYPE10Ref.current.style.color = changeColorFlag(parsedData.utype10c);
          PGMNAMERef.current.style.color = changeColorFlag(parsedData.pgmnamec);
          CURDATERef.current.style.color = changeColorFlag(parsedData.curdatec);
          USRIDINRef.current.style.color = changeColorFlag(parsedData.usridinc);
          FNAME05Ref.current.style.color = changeColorFlag(parsedData.fname05c);
          FNAME06Ref.current.style.color = changeColorFlag(parsedData.fname06c);
          FNAME03Ref.current.style.color = changeColorFlag(parsedData.fname03c);
          FNAME04Ref.current.style.color = changeColorFlag(parsedData.fname04c);
          FNAME01Ref.current.style.color = changeColorFlag(parsedData.fname01c);
          FNAME02Ref.current.style.color = changeColorFlag(parsedData.fname02c);
          USRID10Ref.current.style.color = changeColorFlag(parsedData.usrid10c);
          TITLE01Ref.current.style.color = changeColorFlag(parsedData.title01c);
          TITLE02Ref.current.style.color = changeColorFlag(parsedData.title02c);
          FNAME09Ref.current.style.color = changeColorFlag(parsedData.fname09c);
          FNAME07Ref.current.style.color = changeColorFlag(parsedData.fname07c);
          FNAME08Ref.current.style.color = changeColorFlag(parsedData.fname08c);
          USRID09Ref.current.style.color = changeColorFlag(parsedData.usrid09c);
          USRID02Ref.current.style.color = changeColorFlag(parsedData.usrid02c);
          SEL0007Ref.current.style.color = changeColorFlag(parsedData.sel0007c);
          USRID01Ref.current.style.color = changeColorFlag(parsedData.usrid01c);
          SEL0006Ref.current.style.color = changeColorFlag(parsedData.sel0006c);
          USRID04Ref.current.style.color = changeColorFlag(parsedData.usrid04c);
          SEL0009Ref.current.style.color = changeColorFlag(parsedData.sel0009c);
          USRID03Ref.current.style.color = changeColorFlag(parsedData.usrid03c);
          SEL0008Ref.current.style.color = changeColorFlag(parsedData.sel0008c);
          USRID06Ref.current.style.color = changeColorFlag(parsedData.usrid06c);
          USRID05Ref.current.style.color = changeColorFlag(parsedData.usrid05c);
          USRID08Ref.current.style.color = changeColorFlag(parsedData.usrid08c);
          USRID07Ref.current.style.color = changeColorFlag(parsedData.usrid07c);
          SEL0010Ref.current.style.color = changeColorFlag(parsedData.sel0010c);
          TRNNAMERef.current.style.color = changeColorFlag(parsedData.trnnamec);
          FNAME10Ref.current.style.color = changeColorFlag(parsedData.fname10c);

          changeHighlight(UTYPE05Ref, parsedData.utype05h);
          changeHighlight(UTYPE06Ref, parsedData.utype06h);
          changeHighlight(UTYPE07Ref, parsedData.utype07h);
          changeHighlight(UTYPE08Ref, parsedData.utype08h);
          changeHighlight(UTYPE01Ref, parsedData.utype01h);
          changeHighlight(UTYPE02Ref, parsedData.utype02h);
          changeHighlight(UTYPE03Ref, parsedData.utype03h);
          changeHighlight(UTYPE04Ref, parsedData.utype04h);
          changeHighlight(LNAME09Ref, parsedData.lname09h);
          changeHighlight(UTYPE09Ref, parsedData.utype09h);
          changeHighlight(PAGENUMRef, parsedData.pagenumh);
          changeHighlight(SEL0001Ref, parsedData.sel0001h);
          changeHighlight(SEL0003Ref, parsedData.sel0003h);
          changeHighlight(ERRMSGRef, parsedData.errmsgh);
          changeHighlight(CURTIMERef, parsedData.curtimeh);
          changeHighlight(SEL0002Ref, parsedData.sel0002h);
          changeHighlight(SEL0005Ref, parsedData.sel0005h);
          changeHighlight(SEL0004Ref, parsedData.sel0004h);
          changeHighlight(LNAME10Ref, parsedData.lname10h);
          changeHighlight(LNAME04Ref, parsedData.lname04h);
          changeHighlight(LNAME03Ref, parsedData.lname03h);
          changeHighlight(LNAME02Ref, parsedData.lname02h);
          changeHighlight(LNAME01Ref, parsedData.lname01h);
          changeHighlight(LNAME08Ref, parsedData.lname08h);
          changeHighlight(LNAME07Ref, parsedData.lname07h);
          changeHighlight(LNAME06Ref, parsedData.lname06h);
          changeHighlight(LNAME05Ref, parsedData.lname05h);
          changeHighlight(UTYPE10Ref, parsedData.utype10h);
          changeHighlight(PGMNAMERef, parsedData.pgmnameh);
          changeHighlight(CURDATERef, parsedData.curdateh);
          changeHighlight(USRIDINRef, parsedData.usridinh);
          changeHighlight(FNAME05Ref, parsedData.fname05h);
          changeHighlight(FNAME06Ref, parsedData.fname06h);
          changeHighlight(FNAME03Ref, parsedData.fname03h);
          changeHighlight(FNAME04Ref, parsedData.fname04h);
          changeHighlight(FNAME01Ref, parsedData.fname01h);
          changeHighlight(FNAME02Ref, parsedData.fname02h);
          changeHighlight(USRID10Ref, parsedData.usrid10h);
          changeHighlight(TITLE01Ref, parsedData.title01h);
          changeHighlight(TITLE02Ref, parsedData.title02h);
          changeHighlight(FNAME09Ref, parsedData.fname09h);
          changeHighlight(FNAME07Ref, parsedData.fname07h);
          changeHighlight(FNAME08Ref, parsedData.fname08h);
          changeHighlight(USRID09Ref, parsedData.usrid09h);
          changeHighlight(USRID02Ref, parsedData.usrid02h);
          changeHighlight(SEL0007Ref, parsedData.sel0007h);
          changeHighlight(USRID01Ref, parsedData.usrid01h);
          changeHighlight(SEL0006Ref, parsedData.sel0006h);
          changeHighlight(USRID04Ref, parsedData.usrid04h);
          changeHighlight(SEL0009Ref, parsedData.sel0009h);
          changeHighlight(USRID03Ref, parsedData.usrid03h);
          changeHighlight(SEL0008Ref, parsedData.sel0008h);
          changeHighlight(USRID06Ref, parsedData.usrid06h);
          changeHighlight(USRID05Ref, parsedData.usrid05h);
          changeHighlight(USRID08Ref, parsedData.usrid08h);
          changeHighlight(USRID07Ref, parsedData.usrid07h);
          changeHighlight(SEL0010Ref, parsedData.sel0010h);
          changeHighlight(TRNNAMERef, parsedData.trnnameh);
          changeHighlight(FNAME10Ref, parsedData.fname10h);
      }
    },

    request(systemDto, keyCode, serverUrl, history, SEL0001Ref, SEL0002Ref, SEL0003Ref, SEL0004Ref, SEL0005Ref, SEL0006Ref, SEL0007Ref, SEL0008Ref, SEL0009Ref, SEL0010Ref, USRIDINRef) {
        if(COUSR00_COUSR0AValidation({  SEL0001 : this.SEL0001, SEL0001Ref : SEL0001Ref, SEL0002 : this.SEL0002, SEL0002Ref : SEL0002Ref, SEL0003 : this.SEL0003, SEL0003Ref : SEL0003Ref, SEL0004 : this.SEL0004, SEL0004Ref : SEL0004Ref, SEL0005 : this.SEL0005, SEL0005Ref : SEL0005Ref, SEL0006 : this.SEL0006, SEL0006Ref : SEL0006Ref, SEL0007 : this.SEL0007, SEL0007Ref : SEL0007Ref, SEL0008 : this.SEL0008, SEL0008Ref : SEL0008Ref, SEL0009 : this.SEL0009, SEL0009Ref : SEL0009Ref, SEL0010 : this.SEL0010, SEL0010Ref : SEL0010Ref, USRIDIN : this.USRIDIN, USRIDINRef : USRIDINRef, }) === false) {
            return;
        }

        COUSR0AI.curdatei = this.CURDATE;
        COUSR0AI.curdatel = this.CURDATE.length;
        COUSR0AI.curtimei = this.CURTIME;
        COUSR0AI.curtimel = this.CURTIME.length;
        COUSR0AI.errmsgi = this.ERRMSG;
        COUSR0AI.errmsgl = this.ERRMSG.length;
        COUSR0AI.fname01i = this.FNAME01;
        COUSR0AI.fname01l = this.FNAME01.length;
        COUSR0AI.fname02i = this.FNAME02;
        COUSR0AI.fname02l = this.FNAME02.length;
        COUSR0AI.fname03i = this.FNAME03;
        COUSR0AI.fname03l = this.FNAME03.length;
        COUSR0AI.fname04i = this.FNAME04;
        COUSR0AI.fname04l = this.FNAME04.length;
        COUSR0AI.fname05i = this.FNAME05;
        COUSR0AI.fname05l = this.FNAME05.length;
        COUSR0AI.fname06i = this.FNAME06;
        COUSR0AI.fname06l = this.FNAME06.length;
        COUSR0AI.fname07i = this.FNAME07;
        COUSR0AI.fname07l = this.FNAME07.length;
        COUSR0AI.fname08i = this.FNAME08;
        COUSR0AI.fname08l = this.FNAME08.length;
        COUSR0AI.fname09i = this.FNAME09;
        COUSR0AI.fname09l = this.FNAME09.length;
        COUSR0AI.fname10i = this.FNAME10;
        COUSR0AI.fname10l = this.FNAME10.length;
        COUSR0AI.lname01i = this.LNAME01;
        COUSR0AI.lname01l = this.LNAME01.length;
        COUSR0AI.lname02i = this.LNAME02;
        COUSR0AI.lname02l = this.LNAME02.length;
        COUSR0AI.lname03i = this.LNAME03;
        COUSR0AI.lname03l = this.LNAME03.length;
        COUSR0AI.lname04i = this.LNAME04;
        COUSR0AI.lname04l = this.LNAME04.length;
        COUSR0AI.lname05i = this.LNAME05;
        COUSR0AI.lname05l = this.LNAME05.length;
        COUSR0AI.lname06i = this.LNAME06;
        COUSR0AI.lname06l = this.LNAME06.length;
        COUSR0AI.lname07i = this.LNAME07;
        COUSR0AI.lname07l = this.LNAME07.length;
        COUSR0AI.lname08i = this.LNAME08;
        COUSR0AI.lname08l = this.LNAME08.length;
        COUSR0AI.lname09i = this.LNAME09;
        COUSR0AI.lname09l = this.LNAME09.length;
        COUSR0AI.lname10i = this.LNAME10;
        COUSR0AI.lname10l = this.LNAME10.length;
        COUSR0AI.pagenumi = this.PAGENUM;
        COUSR0AI.pagenuml = this.PAGENUM.length;
        COUSR0AI.pgmnamei = this.PGMNAME;
        COUSR0AI.pgmnamel = this.PGMNAME.length;
        COUSR0AI.title01i = this.TITLE01;
        COUSR0AI.title01l = this.TITLE01.length;
        COUSR0AI.title02i = this.TITLE02;
        COUSR0AI.title02l = this.TITLE02.length;
        COUSR0AI.trnnamei = this.TRNNAME;
        COUSR0AI.trnnamel = this.TRNNAME.length;
        COUSR0AI.usrid01i = this.USRID01;
        COUSR0AI.usrid01l = this.USRID01.length;
        COUSR0AI.usrid02i = this.USRID02;
        COUSR0AI.usrid02l = this.USRID02.length;
        COUSR0AI.usrid03i = this.USRID03;
        COUSR0AI.usrid03l = this.USRID03.length;
        COUSR0AI.usrid04i = this.USRID04;
        COUSR0AI.usrid04l = this.USRID04.length;
        COUSR0AI.usrid05i = this.USRID05;
        COUSR0AI.usrid05l = this.USRID05.length;
        COUSR0AI.usrid06i = this.USRID06;
        COUSR0AI.usrid06l = this.USRID06.length;
        COUSR0AI.usrid07i = this.USRID07;
        COUSR0AI.usrid07l = this.USRID07.length;
        COUSR0AI.usrid08i = this.USRID08;
        COUSR0AI.usrid08l = this.USRID08.length;
        COUSR0AI.usrid09i = this.USRID09;
        COUSR0AI.usrid09l = this.USRID09.length;
        COUSR0AI.usrid10i = this.USRID10;
        COUSR0AI.usrid10l = this.USRID10.length;
        COUSR0AI.utype01i = this.UTYPE01;
        COUSR0AI.utype01l = this.UTYPE01.length;
        COUSR0AI.utype02i = this.UTYPE02;
        COUSR0AI.utype02l = this.UTYPE02.length;
        COUSR0AI.utype03i = this.UTYPE03;
        COUSR0AI.utype03l = this.UTYPE03.length;
        COUSR0AI.utype04i = this.UTYPE04;
        COUSR0AI.utype04l = this.UTYPE04.length;
        COUSR0AI.utype05i = this.UTYPE05;
        COUSR0AI.utype05l = this.UTYPE05.length;
        COUSR0AI.utype06i = this.UTYPE06;
        COUSR0AI.utype06l = this.UTYPE06.length;
        COUSR0AI.utype07i = this.UTYPE07;
        COUSR0AI.utype07l = this.UTYPE07.length;
        COUSR0AI.utype08i = this.UTYPE08;
        COUSR0AI.utype08l = this.UTYPE08.length;
        COUSR0AI.utype09i = this.UTYPE09;
        COUSR0AI.utype09l = this.UTYPE09.length;
        COUSR0AI.utype10i = this.UTYPE10;
        COUSR0AI.utype10l = this.UTYPE10.length;
        COUSR0AI.sel0001i = this.SEL0001;
        COUSR0AI.sel0001l = this.SEL0001.length;
        COUSR0AI.sel0002i = this.SEL0002;
        COUSR0AI.sel0002l = this.SEL0002.length;
        COUSR0AI.sel0003i = this.SEL0003;
        COUSR0AI.sel0003l = this.SEL0003.length;
        COUSR0AI.sel0004i = this.SEL0004;
        COUSR0AI.sel0004l = this.SEL0004.length;
        COUSR0AI.sel0005i = this.SEL0005;
        COUSR0AI.sel0005l = this.SEL0005.length;
        COUSR0AI.sel0006i = this.SEL0006;
        COUSR0AI.sel0006l = this.SEL0006.length;
        COUSR0AI.sel0007i = this.SEL0007;
        COUSR0AI.sel0007l = this.SEL0007.length;
        COUSR0AI.sel0008i = this.SEL0008;
        COUSR0AI.sel0008l = this.SEL0008.length;
        COUSR0AI.sel0009i = this.SEL0009;
        COUSR0AI.sel0009l = this.SEL0009.length;
        COUSR0AI.sel0010i = this.SEL0010;
        COUSR0AI.sel0010l = this.SEL0010.length;
        COUSR0AI.usridini = this.USRIDIN;
        COUSR0AI.usridinl = this.USRIDIN.length;

        let request = makeJson("userId", convertPressedKey(keyCode));
        request.COUSR0AI = COUSR0AI;
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;
        RestPost(history, request, serverUrl, "COUSR00_COUSR0A");
    },

    simpleRequest(systemDto, keyCode, serverUrl, history) {
        let request = makeJson("userId", convertPressedKey(keyCode));
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;

        console.log("simple request [next tx:]" + request.systemDto.nextTransaction);
        RestPost(history, request, serverUrl, "COUSR00_COUSR0A");
    }
});

export default COUSR00_COUSR0AStore;

