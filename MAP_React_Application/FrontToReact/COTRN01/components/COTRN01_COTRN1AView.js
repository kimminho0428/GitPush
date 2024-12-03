import React, {useState, useEffect, useRef, forwardRef} from 'react';
import '../runtime/Lineare.scss';
import '../ui/COTRN01_COTRN1A.scss';
import '../runtime/LayoutTemplate.scss';
import useStore from "../store/UseStore";

const COTRN01_COTRN1AView = forwardRef((props) => {
    const { COTRN01_COTRN1AStore } = useStore();
    const {location, TRNIDINRef, onKeyPressedTRNIDIN , TRNNAMERef, TITLE01Ref, CURDATERef, PGMNAMERef, TITLE02Ref, CURTIMERef, TRNIDRef, CARDNUMRef, TTYPCDRef, TCATCDRef, TRNSRCRef, TDESCRef, TRNAMTRef, TORIGDTRef, TPROCDTRef, MIDRef, MNAMERef, MCITYRef, MZIPRef, ERRMSGRef } = props;

    return (
        <div className='LayoutTemplate'>
          {/*<Navigator termId={termId}>*/}
          {/*  <Logout startCode={startCode} termId={termId} path={path}/>*/}
          {/*</Navigator>*/}
          <div className='linear'>
            <div className = 'COTRN01_COTRN1A'>
                <div className = 'TRNNAME' ref = { TRNNAMERef }>{ COTRN01_COTRN1AStore.TRNNAME }</div>
                <div className = 'TITLE01' ref = { TITLE01Ref }>{ COTRN01_COTRN1AStore.TITLE01 }</div>
                <div className = 'CURDATE' ref = { CURDATERef }>{ COTRN01_COTRN1AStore.CURDATE }</div>
                <div className = 'PGMNAME' ref = { PGMNAMERef }>{ COTRN01_COTRN1AStore.PGMNAME }</div>
                <div className = 'TITLE02' ref = { TITLE02Ref }>{ COTRN01_COTRN1AStore.TITLE02 }</div>
                <div className = 'CURTIME' ref = { CURTIMERef }>{ COTRN01_COTRN1AStore.CURTIME }</div>
                <div className = 'TRNID' ref = { TRNIDRef }>{ COTRN01_COTRN1AStore.TRNID }</div>
                <div className = 'CARDNUM' ref = { CARDNUMRef }>{ COTRN01_COTRN1AStore.CARDNUM }</div>
                <div className = 'TTYPCD' ref = { TTYPCDRef }>{ COTRN01_COTRN1AStore.TTYPCD }</div>
                <div className = 'TCATCD' ref = { TCATCDRef }>{ COTRN01_COTRN1AStore.TCATCD }</div>
                <div className = 'TRNSRC' ref = { TRNSRCRef }>{ COTRN01_COTRN1AStore.TRNSRC }</div>
                <div className = 'TDESC' ref = { TDESCRef }>{ COTRN01_COTRN1AStore.TDESC }</div>
                <div className = 'TRNAMT' ref = { TRNAMTRef }>{ COTRN01_COTRN1AStore.TRNAMT }</div>
                <div className = 'TORIGDT' ref = { TORIGDTRef }>{ COTRN01_COTRN1AStore.TORIGDT }</div>
                <div className = 'TPROCDT' ref = { TPROCDTRef }>{ COTRN01_COTRN1AStore.TPROCDT }</div>
                <div className = 'MID' ref = { MIDRef }>{ COTRN01_COTRN1AStore.MID }</div>
                <div className = 'MNAME' ref = { MNAMERef }>{ COTRN01_COTRN1AStore.MNAME }</div>
                <div className = 'MCITY' ref = { MCITYRef }>{ COTRN01_COTRN1AStore.MCITY }</div>
                <div className = 'MZIP' ref = { MZIPRef }>{ COTRN01_COTRN1AStore.MZIP }</div>
                <div className = 'ERRMSG' ref = { ERRMSGRef }>{ COTRN01_COTRN1AStore.ERRMSG }</div>
                <input className = 'TRNIDIN'
                       type = 'text'
                       name = 'TRNIDIN'
                       value = { COTRN01_COTRN1AStore.TRNIDIN  || ''  }
                       onChange = { onKeyPressedTRNIDIN }
                       ref = { TRNIDINRef }
                       maxLength = { 16.0 }
                ></input>
                <div className = '_field863'>Tran:</div>
                <div className = '_field866'>Date:</div>
                <div className = '_field868'>Prog:</div>
                <div className = '_field871'>Time:</div>
                <div className = '_field873'>View Transaction</div>
                <div className = '_field874'>Enter Tran ID:</div>
                <div className = '_field876'></div>
                <div className = '_field877'>----------------------------------------------------------------------</div>
                <div className = '_field878'>Transaction ID:</div>
                <div className = '_field880'></div>
                <div className = '_field881'>Card Number:</div>
                <div className = '_field883'></div>
                <div className = '_field884'>Type CD:</div>
                <div className = '_field886'></div>
                <div className = '_field887'>Category CD:</div>
                <div className = '_field889'></div>
                <div className = '_field890'>Source:</div>
                <div className = '_field892'></div>
                <div className = '_field893'>Description:</div>
                <div className = '_field895'></div>
                <div className = '_field896'>Amount:</div>
                <div className = '_field898'></div>
                <div className = '_field899'>Orig Date:</div>
                <div className = '_field901'></div>
                <div className = '_field902'>Proc Date:</div>
                <div className = '_field904'></div>
                <div className = '_field905'>Merchant ID:</div>
                <div className = '_field907'></div>
                <div className = '_field908'>Merchant Name:</div>
                <div className = '_field910'></div>
                <div className = '_field911'>Merchant City:</div>
                <div className = '_field913'></div>
                <div className = '_field914'>Merchant Zip:</div>
                <div className = '_field916'></div>
                <div className = '_field918'>ENTER=Fetch  F3=Back  F4=Clear  F5=Browse Tran.</div>
            </div>
          </div>
        </div>
    );
});
export default COTRN01_COTRN1AView;


