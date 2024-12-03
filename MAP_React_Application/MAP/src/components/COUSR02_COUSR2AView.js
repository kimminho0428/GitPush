import React, {useState, useEffect, useRef, forwardRef} from 'react';
import '../runtime/Lineare.scss';
import '../ui/COUSR02_COUSR2A.scss';
import '../runtime/LayoutTemplate.scss';
import useStore from "../store/UseStore";

const COUSR02_COUSR2AView = forwardRef((props) => {
    const { COUSR02_COUSR2AStore } = useStore();
    const {location, USRIDINRef, onKeyPressedUSRIDIN, FNAMERef, onKeyPressedFNAME, LNAMERef, onKeyPressedLNAME, PASSWDRef, onKeyPressedPASSWD, USRTYPERef, onKeyPressedUSRTYPE , TRNNAMERef, TITLE01Ref, CURDATERef, PGMNAMERef, TITLE02Ref, CURTIMERef, ERRMSGRef } = props;

    return (
        <div className='LayoutTemplate'>
          {/*<Navigator termId={termId}>*/}
          {/*  <Logout startCode={startCode} termId={termId} path={path}/>*/}
          {/*</Navigator>*/}
          <div className='linear'>
            <div className = 'COUSR02_COUSR2A'>
                <div className = 'TRNNAME' ref = { TRNNAMERef }>{ COUSR02_COUSR2AStore.TRNNAME }</div>
                <div className = 'TITLE01' ref = { TITLE01Ref }>{ COUSR02_COUSR2AStore.TITLE01 }</div>
                <div className = 'CURDATE' ref = { CURDATERef }>{ COUSR02_COUSR2AStore.CURDATE }</div>
                <div className = 'PGMNAME' ref = { PGMNAMERef }>{ COUSR02_COUSR2AStore.PGMNAME }</div>
                <div className = 'TITLE02' ref = { TITLE02Ref }>{ COUSR02_COUSR2AStore.TITLE02 }</div>
                <div className = 'CURTIME' ref = { CURTIMERef }>{ COUSR02_COUSR2AStore.CURTIME }</div>
                <div className = 'ERRMSG' ref = { ERRMSGRef }>{ COUSR02_COUSR2AStore.ERRMSG }</div>
                <input className = 'USRIDIN'
                       type = 'text'
                       name = 'USRIDIN'
                       value = { COUSR02_COUSR2AStore.USRIDIN  || ''  }
                       onChange = { onKeyPressedUSRIDIN }
                       ref = { USRIDINRef }
                       maxLength = { 8.0 }
                ></input>
                <input className = 'FNAME'
                       type = 'text'
                       name = 'FNAME'
                       value = { COUSR02_COUSR2AStore.FNAME  || ''  }
                       onChange = { onKeyPressedFNAME }
                       ref = { FNAMERef }
                       maxLength = { 20.0 }
                ></input>
                <input className = 'LNAME'
                       type = 'text'
                       name = 'LNAME'
                       value = { COUSR02_COUSR2AStore.LNAME  || ''  }
                       onChange = { onKeyPressedLNAME }
                       ref = { LNAMERef }
                       maxLength = { 20.0 }
                ></input>
                <input className = 'PASSWD'
                       type = 'password'
                       name = 'PASSWD'
                       value = { COUSR02_COUSR2AStore.PASSWD  || ''  }
                       onChange = { onKeyPressedPASSWD }
                       ref = { PASSWDRef }
                       maxLength = { 8.0 }
                ></input>
                <input className = 'USRTYPE'
                       type = 'text'
                       name = 'USRTYPE'
                       value = { COUSR02_COUSR2AStore.USRTYPE  || ''  }
                       onChange = { onKeyPressedUSRTYPE }
                       ref = { USRTYPERef }
                       maxLength = { 1.0 }
                ></input>
                <div className = '_field833'>Tran:</div>
                <div className = '_field836'>Date:</div>
                <div className = '_field838'>Prog:</div>
                <div className = '_field841'>Time:</div>
                <div className = '_field843'>Update User</div>
                <div className = '_field844'>Enter User ID:</div>
                <div className = '_field846'></div>
                <div className = '_field847'>**********************************************************************</div>
                <div className = '_field848'>First Name:</div>
                <div className = '_field850'></div>
                <div className = '_field851'>Last Name:</div>
                <div className = '_field853'></div>
                <div className = '_field854'>Password:</div>
                <div className = '_field856'>(8 Char)</div>
                <div className = '_field857'>User Type: </div>
                <div className = '_field859'>(A=Admin, U=User)</div>
                <div className = '_field861'>ENTER=Fetch  F3=Save&&Exit  F4=Clear  F5=Save  F12=Cancel</div>
            </div>
          </div>
        </div>
    );
});
export default COUSR02_COUSR2AView;


