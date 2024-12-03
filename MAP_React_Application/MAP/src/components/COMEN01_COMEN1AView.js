import React, {useState, useEffect, useRef, forwardRef} from 'react';
import '../runtime/Lineare.scss';
import '../ui/COMEN01_COMEN1A.scss';
import '../runtime/LayoutTemplate.scss';
import useStore from "../store/UseStore";

const COMEN01_COMEN1AView = forwardRef((props) => {
    const { COMEN01_COMEN1AStore } = useStore();
    const {location, OPTIONRef, onKeyPressedOPTION , TRNNAMERef, TITLE01Ref, CURDATERef, PGMNAMERef, TITLE02Ref, CURTIMERef, OPTN001Ref, OPTN002Ref, OPTN003Ref, OPTN004Ref, OPTN005Ref, OPTN006Ref, OPTN007Ref, OPTN008Ref, OPTN009Ref, OPTN010Ref, OPTN011Ref, OPTN012Ref, ERRMSGRef } = props;

    return (
        <div className='LayoutTemplate'>
          {/*<Navigator termId={termId}>*/}
          {/*  <Logout startCode={startCode} termId={termId} path={path}/>*/}
          {/*</Navigator>*/}
          <div className='linear'>
            <div className = 'COMEN01_COMEN1A'>
                <div className = 'TRNNAME' ref = { TRNNAMERef }>{ COMEN01_COMEN1AStore.TRNNAME }</div>
                <div className = 'TITLE01' ref = { TITLE01Ref }>{ COMEN01_COMEN1AStore.TITLE01 }</div>
                <div className = 'CURDATE' ref = { CURDATERef }>{ COMEN01_COMEN1AStore.CURDATE }</div>
                <div className = 'PGMNAME' ref = { PGMNAMERef }>{ COMEN01_COMEN1AStore.PGMNAME }</div>
                <div className = 'TITLE02' ref = { TITLE02Ref }>{ COMEN01_COMEN1AStore.TITLE02 }</div>
                <div className = 'CURTIME' ref = { CURTIMERef }>{ COMEN01_COMEN1AStore.CURTIME }</div>
                <div className = 'OPTN001' ref = { OPTN001Ref }>{ COMEN01_COMEN1AStore.OPTN001 }</div>
                <div className = 'OPTN002' ref = { OPTN002Ref }>{ COMEN01_COMEN1AStore.OPTN002 }</div>
                <div className = 'OPTN003' ref = { OPTN003Ref }>{ COMEN01_COMEN1AStore.OPTN003 }</div>
                <div className = 'OPTN004' ref = { OPTN004Ref }>{ COMEN01_COMEN1AStore.OPTN004 }</div>
                <div className = 'OPTN005' ref = { OPTN005Ref }>{ COMEN01_COMEN1AStore.OPTN005 }</div>
                <div className = 'OPTN006' ref = { OPTN006Ref }>{ COMEN01_COMEN1AStore.OPTN006 }</div>
                <div className = 'OPTN007' ref = { OPTN007Ref }>{ COMEN01_COMEN1AStore.OPTN007 }</div>
                <div className = 'OPTN008' ref = { OPTN008Ref }>{ COMEN01_COMEN1AStore.OPTN008 }</div>
                <div className = 'OPTN009' ref = { OPTN009Ref }>{ COMEN01_COMEN1AStore.OPTN009 }</div>
                <div className = 'OPTN010' ref = { OPTN010Ref }>{ COMEN01_COMEN1AStore.OPTN010 }</div>
                <div className = 'OPTN011' ref = { OPTN011Ref }>{ COMEN01_COMEN1AStore.OPTN011 }</div>
                <div className = 'OPTN012' ref = { OPTN012Ref }>{ COMEN01_COMEN1AStore.OPTN012 }</div>
                <div className = 'ERRMSG' ref = { ERRMSGRef }>{ COMEN01_COMEN1AStore.ERRMSG }</div>
                <input className = 'OPTION'
                       type = 'number'
                       name = 'OPTION'
                       value = { COMEN01_COMEN1AStore.OPTION  || ''  }
                       onChange = { onKeyPressedOPTION }
                       ref = { OPTIONRef }
                       maxLength = { 2.0 }
                ></input>
                <div className = '_field91'>Tran:</div>
                <div className = '_field94'>Date:</div>
                <div className = '_field96'>Prog:</div>
                <div className = '_field99'>Time:</div>
                <div className = '_field101'>Main Menu</div>
                <div className = '_field114'>Please select an option :</div>
                <div className = '_field116'></div>
                <div className = '_field118'>ENTER=Continue  F3=Exit</div>
            </div>
          </div>
        </div>
    );
});
export default COMEN01_COMEN1AView;


