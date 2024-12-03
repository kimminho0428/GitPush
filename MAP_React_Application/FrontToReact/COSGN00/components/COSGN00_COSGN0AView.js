import React, {useState, useEffect, useRef, forwardRef} from 'react';
import '../runtime/Lineare.scss';
import '../ui/COSGN00_COSGN0A.scss';
import '../runtime/LayoutTemplate.scss';
import useStore from "../store/UseStore";

const COSGN00_COSGN0AView = forwardRef((props) => {
    const { COSGN00_COSGN0AStore } = useStore();
    const {location, USERIDRef, onKeyPressedUSERID, PASSWDRef, onKeyPressedPASSWD , TRNNAMERef, TITLE01Ref, CURDATERef, PGMNAMERef, TITLE02Ref, CURTIMERef, APPLIDRef, SYSIDRef, ERRMSGRef } = props;

    return (
        <div className='LayoutTemplate'>
          {/*<Navigator termId={termId}>*/}
          {/*  <Logout startCode={startCode} termId={termId} path={path}/>*/}
          {/*</Navigator>*/}
          <div className='linear'>
            <div className = 'COSGN00_COSGN0A'>
                <div className = 'TRNNAME' ref = { TRNNAMERef }>{ COSGN00_COSGN0AStore.TRNNAME }</div>
                <div className = 'TITLE01' ref = { TITLE01Ref }>{ COSGN00_COSGN0AStore.TITLE01 }</div>
                <div className = 'CURDATE' ref = { CURDATERef }>{ COSGN00_COSGN0AStore.CURDATE }</div>
                <div className = 'PGMNAME' ref = { PGMNAMERef }>{ COSGN00_COSGN0AStore.PGMNAME }</div>
                <div className = 'TITLE02' ref = { TITLE02Ref }>{ COSGN00_COSGN0AStore.TITLE02 }</div>
                <div className = 'CURTIME' ref = { CURTIMERef }>{ COSGN00_COSGN0AStore.CURTIME }</div>
                <div className = 'APPLID' ref = { APPLIDRef }>{ COSGN00_COSGN0AStore.APPLID }</div>
                <div className = 'SYSID' ref = { SYSIDRef }>{ COSGN00_COSGN0AStore.SYSID }</div>
                <div className = 'ERRMSG' ref = { ERRMSGRef }>{ COSGN00_COSGN0AStore.ERRMSG }</div>
                <input className = 'USERID'
                       type = 'text'
                       name = 'USERID'
                       value = { COSGN00_COSGN0AStore.USERID  || ''  }
                       onChange = { onKeyPressedUSERID }
                       ref = { USERIDRef }
                       maxLength = { 8.0 }
                ></input>
                <input className = 'PASSWD'
                       type = 'password'
                       name = 'PASSWD'
                       value = { COSGN00_COSGN0AStore.PASSWD  || ''  }
                       onChange = { onKeyPressedPASSWD }
                       ref = { PASSWDRef }
                       maxLength = { 8.0 }
                ></input>
                <div className = '_field444'>Tran :</div>
                <div className = '_field447'>Date :</div>
                <div className = '_field449'>Prog :</div>
                <div className = '_field452'>Time :</div>
                <div className = '_field454'>AppID:</div>
                <div className = '_field456'>SysID:</div>
                <div className = '_field458'>This is a Credit Card Demo Application for Mainframe Modernization</div>
                <div className = '_field459'>+========================================+</div>
                <div className = '_field460'>|%%%%%%%  NATIONAL RESERVE NOTE  %%%%%%%%|</div>
                <div className = '_field461'>|%(1)  THE UNITED STATES OF KICSLAND (1)%|</div>
                <div className = '_field462'>|%$$              ___       ********  $$%|</div>
                <div className = '_field463'>|%$    {"{x}"}       (o o)                 $%|</div>
                <div className = '_field464'>|%$     ******  (  V  )      O N E     $%|</div>
                <div className = '_field465'>|%(1)          ---m-m---             (1)%|</div>
                <div className = '_field466'>|%%~~~~~~~~~~~ ONE DOLLAR ~~~~~~~~~~~~~%%|</div>
                <div className = '_field467'>+========================================+</div>
                <div className = '_field468'>Type your User ID and Password, then press ENTER:</div>
                <div className = '_field469'>User ID     :</div>
                <div className = '_field471'></div>
                <div className = '_field472'>(8 Char)</div>
                <div className = '_field473'>Password    :</div>
                <div className = '_field475'></div>
                <div className = '_field476'>(8 Char)</div>
                <div className = '_field477'> </div>
                <div className = '_field478'></div>
                <div className = '_field480'>ENTER=Sign-on  F3=Exit</div>
            </div>
          </div>
        </div>
    );
});
export default COSGN00_COSGN0AView;


