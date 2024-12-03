import React, {useState, useEffect, useRef, forwardRef} from 'react';
import '../runtime/Lineare.scss';
import '../ui/COADM01_COADM1A.scss';
import '../runtime/LayoutTemplate.scss';
import useStore from "../store/UseStore";

const COADM01_COADM1AView = forwardRef((props) => {
    const { COADM01_COADM1AStore } = useStore();
    const {location, OPTIONRef, onKeyPressedOPTION , TRNNAMERef, TITLE01Ref, CURDATERef, PGMNAMERef, TITLE02Ref, CURTIMERef, OPTN001Ref, OPTN002Ref, OPTN003Ref, OPTN004Ref, OPTN005Ref, OPTN006Ref, OPTN007Ref, OPTN008Ref, OPTN009Ref, OPTN010Ref, OPTN011Ref, OPTN012Ref, ERRMSGRef } = props;

    return (
        <div className='LayoutTemplate'>
          {/*<Navigator termId={termId}>*/}
          {/*  <Logout startCode={startCode} termId={termId} path={path}/>*/}
          {/*</Navigator>*/}
          <div className='linear'>
            <div className = 'COADM01_COADM1A'>
                <div className = 'TRNNAME' ref = { TRNNAMERef }>{ COADM01_COADM1AStore.TRNNAME }</div>
                <div className = 'TITLE01' ref = { TITLE01Ref }>{ COADM01_COADM1AStore.TITLE01 }</div>
                <div className = 'CURDATE' ref = { CURDATERef }>{ COADM01_COADM1AStore.CURDATE }</div>
                <div className = 'PGMNAME' ref = { PGMNAMERef }>{ COADM01_COADM1AStore.PGMNAME }</div>
                <div className = 'TITLE02' ref = { TITLE02Ref }>{ COADM01_COADM1AStore.TITLE02 }</div>
                <div className = 'CURTIME' ref = { CURTIMERef }>{ COADM01_COADM1AStore.CURTIME }</div>
                <div className = 'OPTN001' ref = { OPTN001Ref }>{ COADM01_COADM1AStore.OPTN001 }</div>
                <div className = 'OPTN002' ref = { OPTN002Ref }>{ COADM01_COADM1AStore.OPTN002 }</div>
                <div className = 'OPTN003' ref = { OPTN003Ref }>{ COADM01_COADM1AStore.OPTN003 }</div>
                <div className = 'OPTN004' ref = { OPTN004Ref }>{ COADM01_COADM1AStore.OPTN004 }</div>
                <div className = 'OPTN005' ref = { OPTN005Ref }>{ COADM01_COADM1AStore.OPTN005 }</div>
                <div className = 'OPTN006' ref = { OPTN006Ref }>{ COADM01_COADM1AStore.OPTN006 }</div>
                <div className = 'OPTN007' ref = { OPTN007Ref }>{ COADM01_COADM1AStore.OPTN007 }</div>
                <div className = 'OPTN008' ref = { OPTN008Ref }>{ COADM01_COADM1AStore.OPTN008 }</div>
                <div className = 'OPTN009' ref = { OPTN009Ref }>{ COADM01_COADM1AStore.OPTN009 }</div>
                <div className = 'OPTN010' ref = { OPTN010Ref }>{ COADM01_COADM1AStore.OPTN010 }</div>
                <div className = 'OPTN011' ref = { OPTN011Ref }>{ COADM01_COADM1AStore.OPTN011 }</div>
                <div className = 'OPTN012' ref = { OPTN012Ref }>{ COADM01_COADM1AStore.OPTN012 }</div>
                <div className = 'ERRMSG' ref = { ERRMSGRef }>{ COADM01_COADM1AStore.ERRMSG }</div>
                <input className = 'OPTION'
                       type = 'number'
                       name = 'OPTION'
                       value = { COADM01_COADM1AStore.OPTION  || ''  }
                       onChange = { onKeyPressedOPTION }
                       ref = { OPTIONRef }
                       maxLength = { 2.0 }
                ></input>
                <div className = '_field769'>Tran:</div>
                <div className = '_field772'>Date:</div>
                <div className = '_field774'>Prog:</div>
                <div className = '_field777'>Time:</div>
                <div className = '_field779'>Admin Menu</div>
                <div className = '_field792'>Please select an option :</div>
                <div className = '_field794'></div>
                <div className = '_field796'>ENTER=Continue  F3=Exit</div>
            </div>
          </div>
        </div>
    );
});
export default COADM01_COADM1AView;


