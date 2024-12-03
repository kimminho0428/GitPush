import React from 'react';
import {observable} from "mobx";
import { COTRN0AI } from "../data/COTRN00_COTRN0AInputDto";
import RestPost from "../runtime/component/io/RestPost";
import {makeJson} from "../runtime/JsonFactory";
import COTRN00_COTRN0AValidation from "./COTRN00_COTRN0AValidation";
import {changeColorFlag, changeHighlight, convertPressedKey} from "../runtime/KeyEvent";

const COTRN00_COTRN0AStore = observable({
      TRNNAME: "",
      TITLE01: "",
      CURDATE: "",
      PGMNAME: "",
      TITLE02: "",
      CURTIME: "",
      PAGENUM: "",
      TRNIDIN: "",
      SEL0001: "",
      TRNID01: "",
      TDATE01: "",
      TDESC01: "",
      TAMT001: "",
      SEL0002: "",
      TRNID02: "",
      TDATE02: "",
      TDESC02: "",
      TAMT002: "",
      SEL0003: "",
      TRNID03: "",
      TDATE03: "",
      TDESC03: "",
      TAMT003: "",
      SEL0004: "",
      TRNID04: "",
      TDATE04: "",
      TDESC04: "",
      TAMT004: "",
      SEL0005: "",
      TRNID05: "",
      TDATE05: "",
      TDESC05: "",
      TAMT005: "",
      SEL0006: "",
      TRNID06: "",
      TDATE06: "",
      TDESC06: "",
      TAMT006: "",
      SEL0007: "",
      TRNID07: "",
      TDATE07: "",
      TDESC07: "",
      TAMT007: "",
      SEL0008: "",
      TRNID08: "",
      TDATE08: "",
      TDESC08: "",
      TAMT008: "",
      SEL0009: "",
      TRNID09: "",
      TDATE09: "",
      TDESC09: "",
      TAMT009: "",
      SEL0010: "",
      TRNID10: "",
      TDATE10: "",
      TDESC10: "",
      TAMT010: "",
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
          this.PAGENUM = "";
          this.TRNIDIN = "";
          this.SEL0001 = "";
          this.TRNID01 = "";
          this.TDATE01 = "";
          this.TDESC01 = "";
          this.TAMT001 = "";
          this.SEL0002 = "";
          this.TRNID02 = "";
          this.TDATE02 = "";
          this.TDESC02 = "";
          this.TAMT002 = "";
          this.SEL0003 = "";
          this.TRNID03 = "";
          this.TDATE03 = "";
          this.TDESC03 = "";
          this.TAMT003 = "";
          this.SEL0004 = "";
          this.TRNID04 = "";
          this.TDATE04 = "";
          this.TDESC04 = "";
          this.TAMT004 = "";
          this.SEL0005 = "";
          this.TRNID05 = "";
          this.TDATE05 = "";
          this.TDESC05 = "";
          this.TAMT005 = "";
          this.SEL0006 = "";
          this.TRNID06 = "";
          this.TDATE06 = "";
          this.TDESC06 = "";
          this.TAMT006 = "";
          this.SEL0007 = "";
          this.TRNID07 = "";
          this.TDATE07 = "";
          this.TDESC07 = "";
          this.TAMT007 = "";
          this.SEL0008 = "";
          this.TRNID08 = "";
          this.TDATE08 = "";
          this.TDESC08 = "";
          this.TAMT008 = "";
          this.SEL0009 = "";
          this.TRNID09 = "";
          this.TDATE09 = "";
          this.TDESC09 = "";
          this.TAMT009 = "";
          this.SEL0010 = "";
          this.TRNID10 = "";
          this.TDATE10 = "";
          this.TDESC10 = "";
          this.TAMT010 = "";
          this.ERRMSG = "";
      }
        this.TAMT002 = parsedData.tamt002o.trim() === '' ? '' : parsedData.tamt002o;
        this.TAMT003 = parsedData.tamt003o.trim() === '' ? '' : parsedData.tamt003o;
        this.TAMT001 = parsedData.tamt001o.trim() === '' ? '' : parsedData.tamt001o;
        this.TRNID03 = parsedData.trnid03o.trim() === '' ? '' : parsedData.trnid03o;
        this.TRNID04 = parsedData.trnid04o.trim() === '' ? '' : parsedData.trnid04o;
        this.TRNID01 = parsedData.trnid01o.trim() === '' ? '' : parsedData.trnid01o;
        this.TRNID02 = parsedData.trnid02o.trim() === '' ? '' : parsedData.trnid02o;
        this.PAGENUM = parsedData.pagenumo.trim() === '' ? '' : parsedData.pagenumo;
        this.SEL0001 = parsedData.sel0001o.trim() === '' ? '' : parsedData.sel0001o;
        this.TRNID09 = parsedData.trnid09o.trim() === '' ? '' : parsedData.trnid09o;
        this.SEL0003 = parsedData.sel0003o.trim() === '' ? '' : parsedData.sel0003o;
        this.TRNID07 = parsedData.trnid07o.trim() === '' ? '' : parsedData.trnid07o;
        this.ERRMSG = parsedData.errmsgo.trim() === '' ? '' : parsedData.errmsgo;
        this.CURTIME = parsedData.curtimeo.trim() === '' ? '' : parsedData.curtimeo;
        this.SEL0002 = parsedData.sel0002o.trim() === '' ? '' : parsedData.sel0002o;
        this.TRNID08 = parsedData.trnid08o.trim() === '' ? '' : parsedData.trnid08o;
        this.SEL0005 = parsedData.sel0005o.trim() === '' ? '' : parsedData.sel0005o;
        this.TRNID05 = parsedData.trnid05o.trim() === '' ? '' : parsedData.trnid05o;
        this.SEL0004 = parsedData.sel0004o.trim() === '' ? '' : parsedData.sel0004o;
        this.TRNID06 = parsedData.trnid06o.trim() === '' ? '' : parsedData.trnid06o;
        this.TDESC03 = parsedData.tdesc03o.trim() === '' ? '' : parsedData.tdesc03o;
        this.TDESC04 = parsedData.tdesc04o.trim() === '' ? '' : parsedData.tdesc04o;
        this.TAMT010 = parsedData.tamt010o.trim() === '' ? '' : parsedData.tamt010o;
        this.TDESC05 = parsedData.tdesc05o.trim() === '' ? '' : parsedData.tdesc05o;
        this.TDESC06 = parsedData.tdesc06o.trim() === '' ? '' : parsedData.tdesc06o;
        this.TDESC07 = parsedData.tdesc07o.trim() === '' ? '' : parsedData.tdesc07o;
        this.TDESC08 = parsedData.tdesc08o.trim() === '' ? '' : parsedData.tdesc08o;
        this.TDESC09 = parsedData.tdesc09o.trim() === '' ? '' : parsedData.tdesc09o;
        this.TDESC01 = parsedData.tdesc01o.trim() === '' ? '' : parsedData.tdesc01o;
        this.TDESC02 = parsedData.tdesc02o.trim() === '' ? '' : parsedData.tdesc02o;
        this.TAMT006 = parsedData.tamt006o.trim() === '' ? '' : parsedData.tamt006o;
        this.TAMT007 = parsedData.tamt007o.trim() === '' ? '' : parsedData.tamt007o;
        this.TAMT004 = parsedData.tamt004o.trim() === '' ? '' : parsedData.tamt004o;
        this.TAMT005 = parsedData.tamt005o.trim() === '' ? '' : parsedData.tamt005o;
        this.PGMNAME = parsedData.pgmnameo.trim() === '' ? '' : parsedData.pgmnameo;
        this.CURDATE = parsedData.curdateo.trim() === '' ? '' : parsedData.curdateo;
        this.TAMT008 = parsedData.tamt008o.trim() === '' ? '' : parsedData.tamt008o;
        this.TAMT009 = parsedData.tamt009o.trim() === '' ? '' : parsedData.tamt009o;
        this.TDESC10 = parsedData.tdesc10o.trim() === '' ? '' : parsedData.tdesc10o;
        this.TDATE01 = parsedData.tdate01o.trim() === '' ? '' : parsedData.tdate01o;
        this.TDATE02 = parsedData.tdate02o.trim() === '' ? '' : parsedData.tdate02o;
        this.TDATE03 = parsedData.tdate03o.trim() === '' ? '' : parsedData.tdate03o;
        this.TDATE04 = parsedData.tdate04o.trim() === '' ? '' : parsedData.tdate04o;
        this.TDATE05 = parsedData.tdate05o.trim() === '' ? '' : parsedData.tdate05o;
        this.TDATE06 = parsedData.tdate06o.trim() === '' ? '' : parsedData.tdate06o;
        this.TITLE01 = parsedData.title01o.trim() === '' ? '' : parsedData.title01o;
        this.TDATE07 = parsedData.tdate07o.trim() === '' ? '' : parsedData.tdate07o;
        this.TITLE02 = parsedData.title02o.trim() === '' ? '' : parsedData.title02o;
        this.TDATE08 = parsedData.tdate08o.trim() === '' ? '' : parsedData.tdate08o;
        this.TDATE09 = parsedData.tdate09o.trim() === '' ? '' : parsedData.tdate09o;
        this.SEL0007 = parsedData.sel0007o.trim() === '' ? '' : parsedData.sel0007o;
        this.SEL0006 = parsedData.sel0006o.trim() === '' ? '' : parsedData.sel0006o;
        this.SEL0009 = parsedData.sel0009o.trim() === '' ? '' : parsedData.sel0009o;
        this.SEL0008 = parsedData.sel0008o.trim() === '' ? '' : parsedData.sel0008o;
        this.TRNID10 = parsedData.trnid10o.trim() === '' ? '' : parsedData.trnid10o;
        this.SEL0010 = parsedData.sel0010o.trim() === '' ? '' : parsedData.sel0010o;
        this.TDATE10 = parsedData.tdate10o.trim() === '' ? '' : parsedData.tdate10o;
        this.TRNNAME = parsedData.trnnameo.trim() === '' ? '' : parsedData.trnnameo;
        this.TRNIDIN = parsedData.trnidino.trim() === '' ? '' : parsedData.trnidino;
    },

    renderStyle(parsedData, TRNNAMERef , TITLE01Ref , CURDATERef , PGMNAMERef , TITLE02Ref , CURTIMERef , PAGENUMRef , TRNIDINRef , SEL0001Ref , TRNID01Ref , TDATE01Ref , TDESC01Ref , TAMT001Ref , SEL0002Ref , TRNID02Ref , TDATE02Ref , TDESC02Ref , TAMT002Ref , SEL0003Ref , TRNID03Ref , TDATE03Ref , TDESC03Ref , TAMT003Ref , SEL0004Ref , TRNID04Ref , TDATE04Ref , TDESC04Ref , TAMT004Ref , SEL0005Ref , TRNID05Ref , TDATE05Ref , TDESC05Ref , TAMT005Ref , SEL0006Ref , TRNID06Ref , TDATE06Ref , TDESC06Ref , TAMT006Ref , SEL0007Ref , TRNID07Ref , TDATE07Ref , TDESC07Ref , TAMT007Ref , SEL0008Ref , TRNID08Ref , TDATE08Ref , TDESC08Ref , TAMT008Ref , SEL0009Ref , TRNID09Ref , TDATE09Ref , TDESC09Ref , TAMT009Ref , SEL0010Ref , TRNID10Ref , TDATE10Ref , TDESC10Ref , TAMT010Ref , ERRMSGRef ) {
      if(parsedData !== null) {
          TAMT002Ref.current.style.color = changeColorFlag(parsedData.tamt002c);
          TAMT003Ref.current.style.color = changeColorFlag(parsedData.tamt003c);
          TAMT001Ref.current.style.color = changeColorFlag(parsedData.tamt001c);
          TRNID03Ref.current.style.color = changeColorFlag(parsedData.trnid03c);
          TRNID04Ref.current.style.color = changeColorFlag(parsedData.trnid04c);
          TRNID01Ref.current.style.color = changeColorFlag(parsedData.trnid01c);
          TRNID02Ref.current.style.color = changeColorFlag(parsedData.trnid02c);
          PAGENUMRef.current.style.color = changeColorFlag(parsedData.pagenumc);
          SEL0001Ref.current.style.color = changeColorFlag(parsedData.sel0001c);
          TRNID09Ref.current.style.color = changeColorFlag(parsedData.trnid09c);
          SEL0003Ref.current.style.color = changeColorFlag(parsedData.sel0003c);
          TRNID07Ref.current.style.color = changeColorFlag(parsedData.trnid07c);
          ERRMSGRef.current.style.color = changeColorFlag(parsedData.errmsgc);
          CURTIMERef.current.style.color = changeColorFlag(parsedData.curtimec);
          SEL0002Ref.current.style.color = changeColorFlag(parsedData.sel0002c);
          TRNID08Ref.current.style.color = changeColorFlag(parsedData.trnid08c);
          SEL0005Ref.current.style.color = changeColorFlag(parsedData.sel0005c);
          TRNID05Ref.current.style.color = changeColorFlag(parsedData.trnid05c);
          SEL0004Ref.current.style.color = changeColorFlag(parsedData.sel0004c);
          TRNID06Ref.current.style.color = changeColorFlag(parsedData.trnid06c);
          TDESC03Ref.current.style.color = changeColorFlag(parsedData.tdesc03c);
          TDESC04Ref.current.style.color = changeColorFlag(parsedData.tdesc04c);
          TAMT010Ref.current.style.color = changeColorFlag(parsedData.tamt010c);
          TDESC05Ref.current.style.color = changeColorFlag(parsedData.tdesc05c);
          TDESC06Ref.current.style.color = changeColorFlag(parsedData.tdesc06c);
          TDESC07Ref.current.style.color = changeColorFlag(parsedData.tdesc07c);
          TDESC08Ref.current.style.color = changeColorFlag(parsedData.tdesc08c);
          TDESC09Ref.current.style.color = changeColorFlag(parsedData.tdesc09c);
          TDESC01Ref.current.style.color = changeColorFlag(parsedData.tdesc01c);
          TDESC02Ref.current.style.color = changeColorFlag(parsedData.tdesc02c);
          TAMT006Ref.current.style.color = changeColorFlag(parsedData.tamt006c);
          TAMT007Ref.current.style.color = changeColorFlag(parsedData.tamt007c);
          TAMT004Ref.current.style.color = changeColorFlag(parsedData.tamt004c);
          TAMT005Ref.current.style.color = changeColorFlag(parsedData.tamt005c);
          PGMNAMERef.current.style.color = changeColorFlag(parsedData.pgmnamec);
          CURDATERef.current.style.color = changeColorFlag(parsedData.curdatec);
          TAMT008Ref.current.style.color = changeColorFlag(parsedData.tamt008c);
          TAMT009Ref.current.style.color = changeColorFlag(parsedData.tamt009c);
          TDESC10Ref.current.style.color = changeColorFlag(parsedData.tdesc10c);
          TDATE01Ref.current.style.color = changeColorFlag(parsedData.tdate01c);
          TDATE02Ref.current.style.color = changeColorFlag(parsedData.tdate02c);
          TDATE03Ref.current.style.color = changeColorFlag(parsedData.tdate03c);
          TDATE04Ref.current.style.color = changeColorFlag(parsedData.tdate04c);
          TDATE05Ref.current.style.color = changeColorFlag(parsedData.tdate05c);
          TDATE06Ref.current.style.color = changeColorFlag(parsedData.tdate06c);
          TITLE01Ref.current.style.color = changeColorFlag(parsedData.title01c);
          TDATE07Ref.current.style.color = changeColorFlag(parsedData.tdate07c);
          TITLE02Ref.current.style.color = changeColorFlag(parsedData.title02c);
          TDATE08Ref.current.style.color = changeColorFlag(parsedData.tdate08c);
          TDATE09Ref.current.style.color = changeColorFlag(parsedData.tdate09c);
          SEL0007Ref.current.style.color = changeColorFlag(parsedData.sel0007c);
          SEL0006Ref.current.style.color = changeColorFlag(parsedData.sel0006c);
          SEL0009Ref.current.style.color = changeColorFlag(parsedData.sel0009c);
          SEL0008Ref.current.style.color = changeColorFlag(parsedData.sel0008c);
          TRNID10Ref.current.style.color = changeColorFlag(parsedData.trnid10c);
          SEL0010Ref.current.style.color = changeColorFlag(parsedData.sel0010c);
          TDATE10Ref.current.style.color = changeColorFlag(parsedData.tdate10c);
          TRNNAMERef.current.style.color = changeColorFlag(parsedData.trnnamec);
          TRNIDINRef.current.style.color = changeColorFlag(parsedData.trnidinc);

          changeHighlight(TAMT002Ref, parsedData.tamt002h);
          changeHighlight(TAMT003Ref, parsedData.tamt003h);
          changeHighlight(TAMT001Ref, parsedData.tamt001h);
          changeHighlight(TRNID03Ref, parsedData.trnid03h);
          changeHighlight(TRNID04Ref, parsedData.trnid04h);
          changeHighlight(TRNID01Ref, parsedData.trnid01h);
          changeHighlight(TRNID02Ref, parsedData.trnid02h);
          changeHighlight(PAGENUMRef, parsedData.pagenumh);
          changeHighlight(SEL0001Ref, parsedData.sel0001h);
          changeHighlight(TRNID09Ref, parsedData.trnid09h);
          changeHighlight(SEL0003Ref, parsedData.sel0003h);
          changeHighlight(TRNID07Ref, parsedData.trnid07h);
          changeHighlight(ERRMSGRef, parsedData.errmsgh);
          changeHighlight(CURTIMERef, parsedData.curtimeh);
          changeHighlight(SEL0002Ref, parsedData.sel0002h);
          changeHighlight(TRNID08Ref, parsedData.trnid08h);
          changeHighlight(SEL0005Ref, parsedData.sel0005h);
          changeHighlight(TRNID05Ref, parsedData.trnid05h);
          changeHighlight(SEL0004Ref, parsedData.sel0004h);
          changeHighlight(TRNID06Ref, parsedData.trnid06h);
          changeHighlight(TDESC03Ref, parsedData.tdesc03h);
          changeHighlight(TDESC04Ref, parsedData.tdesc04h);
          changeHighlight(TAMT010Ref, parsedData.tamt010h);
          changeHighlight(TDESC05Ref, parsedData.tdesc05h);
          changeHighlight(TDESC06Ref, parsedData.tdesc06h);
          changeHighlight(TDESC07Ref, parsedData.tdesc07h);
          changeHighlight(TDESC08Ref, parsedData.tdesc08h);
          changeHighlight(TDESC09Ref, parsedData.tdesc09h);
          changeHighlight(TDESC01Ref, parsedData.tdesc01h);
          changeHighlight(TDESC02Ref, parsedData.tdesc02h);
          changeHighlight(TAMT006Ref, parsedData.tamt006h);
          changeHighlight(TAMT007Ref, parsedData.tamt007h);
          changeHighlight(TAMT004Ref, parsedData.tamt004h);
          changeHighlight(TAMT005Ref, parsedData.tamt005h);
          changeHighlight(PGMNAMERef, parsedData.pgmnameh);
          changeHighlight(CURDATERef, parsedData.curdateh);
          changeHighlight(TAMT008Ref, parsedData.tamt008h);
          changeHighlight(TAMT009Ref, parsedData.tamt009h);
          changeHighlight(TDESC10Ref, parsedData.tdesc10h);
          changeHighlight(TDATE01Ref, parsedData.tdate01h);
          changeHighlight(TDATE02Ref, parsedData.tdate02h);
          changeHighlight(TDATE03Ref, parsedData.tdate03h);
          changeHighlight(TDATE04Ref, parsedData.tdate04h);
          changeHighlight(TDATE05Ref, parsedData.tdate05h);
          changeHighlight(TDATE06Ref, parsedData.tdate06h);
          changeHighlight(TITLE01Ref, parsedData.title01h);
          changeHighlight(TDATE07Ref, parsedData.tdate07h);
          changeHighlight(TITLE02Ref, parsedData.title02h);
          changeHighlight(TDATE08Ref, parsedData.tdate08h);
          changeHighlight(TDATE09Ref, parsedData.tdate09h);
          changeHighlight(SEL0007Ref, parsedData.sel0007h);
          changeHighlight(SEL0006Ref, parsedData.sel0006h);
          changeHighlight(SEL0009Ref, parsedData.sel0009h);
          changeHighlight(SEL0008Ref, parsedData.sel0008h);
          changeHighlight(TRNID10Ref, parsedData.trnid10h);
          changeHighlight(SEL0010Ref, parsedData.sel0010h);
          changeHighlight(TDATE10Ref, parsedData.tdate10h);
          changeHighlight(TRNNAMERef, parsedData.trnnameh);
          changeHighlight(TRNIDINRef, parsedData.trnidinh);
      }
    },

    request(systemDto, keyCode, serverUrl, history, SEL0001Ref, SEL0002Ref, SEL0003Ref, SEL0004Ref, SEL0005Ref, SEL0006Ref, SEL0007Ref, SEL0008Ref, SEL0009Ref, SEL0010Ref, TRNIDINRef) {
        if(COTRN00_COTRN0AValidation({  SEL0001 : this.SEL0001, SEL0001Ref : SEL0001Ref, SEL0002 : this.SEL0002, SEL0002Ref : SEL0002Ref, SEL0003 : this.SEL0003, SEL0003Ref : SEL0003Ref, SEL0004 : this.SEL0004, SEL0004Ref : SEL0004Ref, SEL0005 : this.SEL0005, SEL0005Ref : SEL0005Ref, SEL0006 : this.SEL0006, SEL0006Ref : SEL0006Ref, SEL0007 : this.SEL0007, SEL0007Ref : SEL0007Ref, SEL0008 : this.SEL0008, SEL0008Ref : SEL0008Ref, SEL0009 : this.SEL0009, SEL0009Ref : SEL0009Ref, SEL0010 : this.SEL0010, SEL0010Ref : SEL0010Ref, TRNIDIN : this.TRNIDIN, TRNIDINRef : TRNIDINRef, }) === false) {
            return;
        }

        COTRN0AI.curdatei = this.CURDATE;
        COTRN0AI.curdatel = this.CURDATE.length;
        COTRN0AI.curtimei = this.CURTIME;
        COTRN0AI.curtimel = this.CURTIME.length;
        COTRN0AI.errmsgi = this.ERRMSG;
        COTRN0AI.errmsgl = this.ERRMSG.length;
        COTRN0AI.pagenumi = this.PAGENUM;
        COTRN0AI.pagenuml = this.PAGENUM.length;
        COTRN0AI.pgmnamei = this.PGMNAME;
        COTRN0AI.pgmnamel = this.PGMNAME.length;
        COTRN0AI.tamt001i = this.TAMT001;
        COTRN0AI.tamt001l = this.TAMT001.length;
        COTRN0AI.tamt002i = this.TAMT002;
        COTRN0AI.tamt002l = this.TAMT002.length;
        COTRN0AI.tamt003i = this.TAMT003;
        COTRN0AI.tamt003l = this.TAMT003.length;
        COTRN0AI.tamt004i = this.TAMT004;
        COTRN0AI.tamt004l = this.TAMT004.length;
        COTRN0AI.tamt005i = this.TAMT005;
        COTRN0AI.tamt005l = this.TAMT005.length;
        COTRN0AI.tamt006i = this.TAMT006;
        COTRN0AI.tamt006l = this.TAMT006.length;
        COTRN0AI.tamt007i = this.TAMT007;
        COTRN0AI.tamt007l = this.TAMT007.length;
        COTRN0AI.tamt008i = this.TAMT008;
        COTRN0AI.tamt008l = this.TAMT008.length;
        COTRN0AI.tamt009i = this.TAMT009;
        COTRN0AI.tamt009l = this.TAMT009.length;
        COTRN0AI.tamt010i = this.TAMT010;
        COTRN0AI.tamt010l = this.TAMT010.length;
        COTRN0AI.tdate01i = this.TDATE01;
        COTRN0AI.tdate01l = this.TDATE01.length;
        COTRN0AI.tdate02i = this.TDATE02;
        COTRN0AI.tdate02l = this.TDATE02.length;
        COTRN0AI.tdate03i = this.TDATE03;
        COTRN0AI.tdate03l = this.TDATE03.length;
        COTRN0AI.tdate04i = this.TDATE04;
        COTRN0AI.tdate04l = this.TDATE04.length;
        COTRN0AI.tdate05i = this.TDATE05;
        COTRN0AI.tdate05l = this.TDATE05.length;
        COTRN0AI.tdate06i = this.TDATE06;
        COTRN0AI.tdate06l = this.TDATE06.length;
        COTRN0AI.tdate07i = this.TDATE07;
        COTRN0AI.tdate07l = this.TDATE07.length;
        COTRN0AI.tdate08i = this.TDATE08;
        COTRN0AI.tdate08l = this.TDATE08.length;
        COTRN0AI.tdate09i = this.TDATE09;
        COTRN0AI.tdate09l = this.TDATE09.length;
        COTRN0AI.tdate10i = this.TDATE10;
        COTRN0AI.tdate10l = this.TDATE10.length;
        COTRN0AI.tdesc01i = this.TDESC01;
        COTRN0AI.tdesc01l = this.TDESC01.length;
        COTRN0AI.tdesc02i = this.TDESC02;
        COTRN0AI.tdesc02l = this.TDESC02.length;
        COTRN0AI.tdesc03i = this.TDESC03;
        COTRN0AI.tdesc03l = this.TDESC03.length;
        COTRN0AI.tdesc04i = this.TDESC04;
        COTRN0AI.tdesc04l = this.TDESC04.length;
        COTRN0AI.tdesc05i = this.TDESC05;
        COTRN0AI.tdesc05l = this.TDESC05.length;
        COTRN0AI.tdesc06i = this.TDESC06;
        COTRN0AI.tdesc06l = this.TDESC06.length;
        COTRN0AI.tdesc07i = this.TDESC07;
        COTRN0AI.tdesc07l = this.TDESC07.length;
        COTRN0AI.tdesc08i = this.TDESC08;
        COTRN0AI.tdesc08l = this.TDESC08.length;
        COTRN0AI.tdesc09i = this.TDESC09;
        COTRN0AI.tdesc09l = this.TDESC09.length;
        COTRN0AI.tdesc10i = this.TDESC10;
        COTRN0AI.tdesc10l = this.TDESC10.length;
        COTRN0AI.title01i = this.TITLE01;
        COTRN0AI.title01l = this.TITLE01.length;
        COTRN0AI.title02i = this.TITLE02;
        COTRN0AI.title02l = this.TITLE02.length;
        COTRN0AI.trnid01i = this.TRNID01;
        COTRN0AI.trnid01l = this.TRNID01.length;
        COTRN0AI.trnid02i = this.TRNID02;
        COTRN0AI.trnid02l = this.TRNID02.length;
        COTRN0AI.trnid03i = this.TRNID03;
        COTRN0AI.trnid03l = this.TRNID03.length;
        COTRN0AI.trnid04i = this.TRNID04;
        COTRN0AI.trnid04l = this.TRNID04.length;
        COTRN0AI.trnid05i = this.TRNID05;
        COTRN0AI.trnid05l = this.TRNID05.length;
        COTRN0AI.trnid06i = this.TRNID06;
        COTRN0AI.trnid06l = this.TRNID06.length;
        COTRN0AI.trnid07i = this.TRNID07;
        COTRN0AI.trnid07l = this.TRNID07.length;
        COTRN0AI.trnid08i = this.TRNID08;
        COTRN0AI.trnid08l = this.TRNID08.length;
        COTRN0AI.trnid09i = this.TRNID09;
        COTRN0AI.trnid09l = this.TRNID09.length;
        COTRN0AI.trnid10i = this.TRNID10;
        COTRN0AI.trnid10l = this.TRNID10.length;
        COTRN0AI.trnnamei = this.TRNNAME;
        COTRN0AI.trnnamel = this.TRNNAME.length;
        COTRN0AI.sel0001i = this.SEL0001;
        COTRN0AI.sel0001l = this.SEL0001.length;
        COTRN0AI.sel0002i = this.SEL0002;
        COTRN0AI.sel0002l = this.SEL0002.length;
        COTRN0AI.sel0003i = this.SEL0003;
        COTRN0AI.sel0003l = this.SEL0003.length;
        COTRN0AI.sel0004i = this.SEL0004;
        COTRN0AI.sel0004l = this.SEL0004.length;
        COTRN0AI.sel0005i = this.SEL0005;
        COTRN0AI.sel0005l = this.SEL0005.length;
        COTRN0AI.sel0006i = this.SEL0006;
        COTRN0AI.sel0006l = this.SEL0006.length;
        COTRN0AI.sel0007i = this.SEL0007;
        COTRN0AI.sel0007l = this.SEL0007.length;
        COTRN0AI.sel0008i = this.SEL0008;
        COTRN0AI.sel0008l = this.SEL0008.length;
        COTRN0AI.sel0009i = this.SEL0009;
        COTRN0AI.sel0009l = this.SEL0009.length;
        COTRN0AI.sel0010i = this.SEL0010;
        COTRN0AI.sel0010l = this.SEL0010.length;
        COTRN0AI.trnidini = this.TRNIDIN;
        COTRN0AI.trnidinl = this.TRNIDIN.length;

        let request = makeJson("userId", convertPressedKey(keyCode));
        request.COTRN0AI = COTRN0AI;
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;
        RestPost(history, request, serverUrl, "COTRN00_COTRN0A");
    },

    simpleRequest(systemDto, keyCode, serverUrl, history) {
        let request = makeJson("userId", convertPressedKey(keyCode));
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;

        console.log("simple request [next tx:]" + request.systemDto.nextTransaction);
        RestPost(history, request, serverUrl, "COTRN00_COTRN0A");
    }
});

export default COTRN00_COTRN0AStore;

