import React, {useState, useEffect, useRef, forwardRef} from 'react';
import '../runtime/Lineare.scss';
import '../ui/COUSR03_COUSR3A.scss';
import '../runtime/LayoutTemplate.scss';
import useStore from "../store/UseStore";

const COUSR03_COUSR3AView = forwardRef((props) => {
    const { COUSR03_COUSR3AStore } = useStore();
    const {location, USRIDINRef, onKeyPressedUSRIDIN , TRNNAMERef, TITLE01Ref, CURDATERef, PGMNAMERef, TITLE02Ref, CURTIMERef, FNAMERef, LNAMERef, USRTYPERef, ERRMSGRef } = props;

    return (
        <div className='LayoutTemplate'>
          {/*<Navigator termId={termId}>*/}
          {/*  <Logout startCode={startCode} termId={termId} path={path}/>*/}
          {/*</Navigator>*/}
          <div className='linear'>
            <div className = 'COUSR03_COUSR3A'>
                <div className = 'TRNNAME' ref = { TRNNAMERef }>{ COUSR03_COUSR3AStore.TRNNAME }</div>
                <div className = 'TITLE01' ref = { TITLE01Ref }>{ COUSR03_COUSR3AStore.TITLE01 }</div>
                <div className = 'CURDATE' ref = { CURDATERef }>{ COUSR03_COUSR3AStore.CURDATE }</div>
                <div className = 'PGMNAME' ref = { PGMNAMERef }>{ COUSR03_COUSR3AStore.PGMNAME }</div>
                <div className = 'TITLE02' ref = { TITLE02Ref }>{ COUSR03_COUSR3AStore.TITLE02 }</div>
                <div className = 'CURTIME' ref = { CURTIMERef }>{ COUSR03_COUSR3AStore.CURTIME }</div>
                <div className = 'FNAME' ref = { FNAMERef }>{ COUSR03_COUSR3AStore.FNAME }</div>
                <div className = 'LNAME' ref = { LNAMERef }>{ COUSR03_COUSR3AStore.LNAME }</div>
                <div className = 'USRTYPE' ref = { USRTYPERef }>{ COUSR03_COUSR3AStore.USRTYPE }</div>
                <div className = 'ERRMSG' ref = { ERRMSGRef }>{ COUSR03_COUSR3AStore.ERRMSG }</div>
                <input className = 'USRIDIN'
                       type = 'text'
                       name = 'USRIDIN'
                       value = { COUSR03_COUSR3AStore.USRIDIN  || ''  }
                       onChange = { onKeyPressedUSRIDIN }
                       ref = { USRIDINRef }
                       maxLength = { 8.0 }
                ></input>
                <div className = '_field550'>Tran:</div>
                <div className = '_field553'>Date:</div>
                <div className = '_field555'>Prog:</div>
                <div className = '_field558'>Time:</div>
                <div className = '_field560'>Delete User</div>
                <div className = '_field561'>Enter User ID:</div>
                <div className = '_field563'></div>
                <div className = '_field564'>**********************************************************************</div>
                <div className = '_field565'>First Name:</div>
                <div className = '_field567'></div>
                <div className = '_field568'>Last Name:</div>
                <div className = '_field570'></div>
                <div className = '_field571'>User Type: </div>
                <div className = '_field573'>(A=Admin, U=User)</div>
                <div className = '_field575'>ENTER=Fetch  F3=Back  F4=Clear  F5=Delete</div>
            </div>
          </div>
        </div>
    );
});
export default COUSR03_COUSR3AView;


