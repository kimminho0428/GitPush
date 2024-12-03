import React, {useState, useEffect, useRef, forwardRef} from 'react';
import '../runtime/Lineare.scss';
import '../ui/COUSR01_COUSR1A.scss';
import '../runtime/LayoutTemplate.scss';
import useStore from "../store/UseStore";

const COUSR01_COUSR1AView = forwardRef((props) => {
    const { COUSR01_COUSR1AStore } = useStore();
    const {location, FNAMERef, onKeyPressedFNAME, LNAMERef, onKeyPressedLNAME, USERIDRef, onKeyPressedUSERID, PASSWDRef, onKeyPressedPASSWD, USRTYPERef, onKeyPressedUSRTYPE , TRNNAMERef, TITLE01Ref, CURDATERef, PGMNAMERef, TITLE02Ref, CURTIMERef, ERRMSGRef } = props;

    return (
        <div className='LayoutTemplate'>
          {/*<Navigator termId={termId}>*/}
          {/*  <Logout startCode={startCode} termId={termId} path={path}/>*/}
          {/*</Navigator>*/}
          <div className='linear'>
            <div className = 'COUSR01_COUSR1A'>
                <div className = 'TRNNAME' ref = { TRNNAMERef }>{ COUSR01_COUSR1AStore.TRNNAME }</div>
                <div className = 'TITLE01' ref = { TITLE01Ref }>{ COUSR01_COUSR1AStore.TITLE01 }</div>
                <div className = 'CURDATE' ref = { CURDATERef }>{ COUSR01_COUSR1AStore.CURDATE }</div>
                <div className = 'PGMNAME' ref = { PGMNAMERef }>{ COUSR01_COUSR1AStore.PGMNAME }</div>
                <div className = 'TITLE02' ref = { TITLE02Ref }>{ COUSR01_COUSR1AStore.TITLE02 }</div>
                <div className = 'CURTIME' ref = { CURTIMERef }>{ COUSR01_COUSR1AStore.CURTIME }</div>
                <div className = 'ERRMSG' ref = { ERRMSGRef }>{ COUSR01_COUSR1AStore.ERRMSG }</div>
                <input className = 'FNAME'
                       type = 'text'
                       name = 'FNAME'
                       value = { COUSR01_COUSR1AStore.FNAME  || ''  }
                       onChange = { onKeyPressedFNAME }
                       ref = { FNAMERef }
                       maxLength = { 20.0 }
                ></input>
                <input className = 'LNAME'
                       type = 'text'
                       name = 'LNAME'
                       value = { COUSR01_COUSR1AStore.LNAME  || ''  }
                       onChange = { onKeyPressedLNAME }
                       ref = { LNAMERef }
                       maxLength = { 20.0 }
                ></input>
                <input className = 'USERID'
                       type = 'text'
                       name = 'USERID'
                       value = { COUSR01_COUSR1AStore.USERID  || ''  }
                       onChange = { onKeyPressedUSERID }
                       ref = { USERIDRef }
                       maxLength = { 8.0 }
                ></input>
                <input className = 'PASSWD'
                       type = 'password'
                       name = 'PASSWD'
                       value = { COUSR01_COUSR1AStore.PASSWD  || ''  }
                       onChange = { onKeyPressedPASSWD }
                       ref = { PASSWDRef }
                       maxLength = { 8.0 }
                ></input>
                <input className = 'USRTYPE'
                       type = 'text'
                       name = 'USRTYPE'
                       value = { COUSR01_COUSR1AStore.USRTYPE  || ''  }
                       onChange = { onKeyPressedUSRTYPE }
                       ref = { USRTYPERef }
                       maxLength = { 1.0 }
                ></input>
                <div className = '_field740'>Tran:</div>
                <div className = '_field743'>Date:</div>
                <div className = '_field745'>Prog:</div>
                <div className = '_field748'>Time:</div>
                <div className = '_field750'>Add User</div>
                <div className = '_field751'>First Name:</div>
                <div className = '_field753'></div>
                <div className = '_field754'>Last Name:</div>
                <div className = '_field756'></div>
                <div className = '_field757'>User ID:</div>
                <div className = '_field759'>(8 Char)</div>
                <div className = '_field760'>Password:</div>
                <div className = '_field762'>(8 Char)</div>
                <div className = '_field763'>User Type: </div>
                <div className = '_field765'>(A=Admin, U=User)</div>
                <div className = '_field767'>ENTER=Add User  F3=Back  F4=Clear  F12=Exit</div>
            </div>
          </div>
        </div>
    );
});
export default COUSR01_COUSR1AView;


