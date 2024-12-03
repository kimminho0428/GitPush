import React, {useState, useEffect, useRef, forwardRef} from 'react';
import '../runtime/Lineare.scss';
import '../ui/COBIL00_COBIL0A.scss';
import '../runtime/LayoutTemplate.scss';
import useStore from "../store/UseStore";

const COBIL00_COBIL0AView = forwardRef((props) => {
    const { COBIL00_COBIL0AStore } = useStore();
    const {location, ACTIDINRef, onKeyPressedACTIDIN, CONFIRMRef, onKeyPressedCONFIRM , TRNNAMERef, TITLE01Ref, CURDATERef, PGMNAMERef, TITLE02Ref, CURTIMERef, CURBALRef, ERRMSGRef } = props;

    return (
        <div className='LayoutTemplate'>
          {/*<Navigator termId={termId}>*/}
          {/*  <Logout startCode={startCode} termId={termId} path={path}/>*/}
          {/*</Navigator>*/}
          <div className='linear'>
            <div className = 'COBIL00_COBIL0A'>
                <div className = 'TRNNAME' ref = { TRNNAMERef }>{ COBIL00_COBIL0AStore.TRNNAME }</div>
                <div className = 'TITLE01' ref = { TITLE01Ref }>{ COBIL00_COBIL0AStore.TITLE01 }</div>
                <div className = 'CURDATE' ref = { CURDATERef }>{ COBIL00_COBIL0AStore.CURDATE }</div>
                <div className = 'PGMNAME' ref = { PGMNAMERef }>{ COBIL00_COBIL0AStore.PGMNAME }</div>
                <div className = 'TITLE02' ref = { TITLE02Ref }>{ COBIL00_COBIL0AStore.TITLE02 }</div>
                <div className = 'CURTIME' ref = { CURTIMERef }>{ COBIL00_COBIL0AStore.CURTIME }</div>
                <div className = 'CURBAL' ref = { CURBALRef }>{ COBIL00_COBIL0AStore.CURBAL }</div>
                <div className = 'ERRMSG' ref = { ERRMSGRef }>{ COBIL00_COBIL0AStore.ERRMSG }</div>
                <input className = 'ACTIDIN'
                       type = 'text'
                       name = 'ACTIDIN'
                       value = { COBIL00_COBIL0AStore.ACTIDIN  || ''  }
                       onChange = { onKeyPressedACTIDIN }
                       ref = { ACTIDINRef }
                       maxLength = { 11.0 }
                ></input>
                <input className = 'CONFIRM'
                       type = 'text'
                       name = 'CONFIRM'
                       value = { COBIL00_COBIL0AStore.CONFIRM  || ''  }
                       onChange = { onKeyPressedCONFIRM }
                       ref = { CONFIRMRef }
                       maxLength = { 1.0 }
                ></input>
                <div className = '_field482'>Tran:</div>
                <div className = '_field485'>Date:</div>
                <div className = '_field487'>Prog:</div>
                <div className = '_field490'>Time:</div>
                <div className = '_field492'>Bill Payment</div>
                <div className = '_field493'>Enter Acct ID:</div>
                <div className = '_field495'></div>
                <div className = '_field496'>----------------------------------------------------------------------</div>
                <div className = '_field497'>Your current balance is: </div>
                <div className = '_field499'></div>
                <div className = '_field500'>Do you want to pay your balance now. Please confirm: </div>
                <div className = '_field502'></div>
                <div className = '_field503'>(Y/N)</div>
                <div className = '_field505'>ENTER=Continue  F3=Back  F4=Clear</div>
            </div>
          </div>
        </div>
    );
});
export default COBIL00_COBIL0AView;


