import React, {useState, useEffect, useRef, forwardRef} from 'react';
import '../runtime/Lineare.scss';
import '../ui/COACTVW_CACTVWA.scss';
import '../runtime/LayoutTemplate.scss';
import useStore from "../store/UseStore";

const COACTVW_CACTVWAView = forwardRef((props) => {
    const { COACTVW_CACTVWAStore } = useStore();
    const {location, ACCTSIDRef, onKeyPressedACCTSID , TRNNAMERef, TITLE01Ref, CURDATERef, PGMNAMERef, TITLE02Ref, CURTIMERef, ACSTTUSRef, ADTOPENRef, ACRDLIMRef, AEXPDTRef, ACSHLIMRef, AREISDTRef, ACURBALRef, ACRCYCRRef, AADDGRPRef, ACRCYDBRef, ACSTNUMRef, ACSTSSNRef, ACSTDOBRef, ACSTFCORef, ACSFNAMRef, ACSMNAMRef, ACSLNAMRef, ACSADL1Ref, ACSSTTERef, ACSADL2Ref, ACSZIPCRef, ACSCITYRef, ACSCTRYRef, ACSPHN1Ref, ACSGOVTRef, ACSPHN2Ref, ACSEFTCRef, ACSPFLGRef, INFOMSGRef, ERRMSGRef } = props;

    return (
        <div className='LayoutTemplate'>
          {/*<Navigator termId={termId}>*/}
          {/*  <Logout startCode={startCode} termId={termId} path={path}/>*/}
          {/*</Navigator>*/}
          <div className='linear'>
            <div className = 'COACTVW_CACTVWA'>
                <div className = 'TRNNAME' ref = { TRNNAMERef }>{ COACTVW_CACTVWAStore.TRNNAME }</div>
                <div className = 'TITLE01' ref = { TITLE01Ref }>{ COACTVW_CACTVWAStore.TITLE01 }</div>
                <div className = 'CURDATE' ref = { CURDATERef }>{ COACTVW_CACTVWAStore.CURDATE }</div>
                <div className = 'PGMNAME' ref = { PGMNAMERef }>{ COACTVW_CACTVWAStore.PGMNAME }</div>
                <div className = 'TITLE02' ref = { TITLE02Ref }>{ COACTVW_CACTVWAStore.TITLE02 }</div>
                <div className = 'CURTIME' ref = { CURTIMERef }>{ COACTVW_CACTVWAStore.CURTIME }</div>
                <div className = 'ACSTTUS' ref = { ACSTTUSRef }>{ COACTVW_CACTVWAStore.ACSTTUS }</div>
                <div className = 'ADTOPEN' ref = { ADTOPENRef }>{ COACTVW_CACTVWAStore.ADTOPEN }</div>
                <div className = 'ACRDLIM' ref = { ACRDLIMRef }>{ COACTVW_CACTVWAStore.ACRDLIM }</div>
                <div className = 'AEXPDT' ref = { AEXPDTRef }>{ COACTVW_CACTVWAStore.AEXPDT }</div>
                <div className = 'ACSHLIM' ref = { ACSHLIMRef }>{ COACTVW_CACTVWAStore.ACSHLIM }</div>
                <div className = 'AREISDT' ref = { AREISDTRef }>{ COACTVW_CACTVWAStore.AREISDT }</div>
                <div className = 'ACURBAL' ref = { ACURBALRef }>{ COACTVW_CACTVWAStore.ACURBAL }</div>
                <div className = 'ACRCYCR' ref = { ACRCYCRRef }>{ COACTVW_CACTVWAStore.ACRCYCR }</div>
                <div className = 'AADDGRP' ref = { AADDGRPRef }>{ COACTVW_CACTVWAStore.AADDGRP }</div>
                <div className = 'ACRCYDB' ref = { ACRCYDBRef }>{ COACTVW_CACTVWAStore.ACRCYDB }</div>
                <div className = 'ACSTNUM' ref = { ACSTNUMRef }>{ COACTVW_CACTVWAStore.ACSTNUM }</div>
                <div className = 'ACSTSSN' ref = { ACSTSSNRef }>{ COACTVW_CACTVWAStore.ACSTSSN }</div>
                <div className = 'ACSTDOB' ref = { ACSTDOBRef }>{ COACTVW_CACTVWAStore.ACSTDOB }</div>
                <div className = 'ACSTFCO' ref = { ACSTFCORef }>{ COACTVW_CACTVWAStore.ACSTFCO }</div>
                <div className = 'ACSFNAM' ref = { ACSFNAMRef }>{ COACTVW_CACTVWAStore.ACSFNAM }</div>
                <div className = 'ACSMNAM' ref = { ACSMNAMRef }>{ COACTVW_CACTVWAStore.ACSMNAM }</div>
                <div className = 'ACSLNAM' ref = { ACSLNAMRef }>{ COACTVW_CACTVWAStore.ACSLNAM }</div>
                <div className = 'ACSADL1' ref = { ACSADL1Ref }>{ COACTVW_CACTVWAStore.ACSADL1 }</div>
                <div className = 'ACSSTTE' ref = { ACSSTTERef }>{ COACTVW_CACTVWAStore.ACSSTTE }</div>
                <div className = 'ACSADL2' ref = { ACSADL2Ref }>{ COACTVW_CACTVWAStore.ACSADL2 }</div>
                <div className = 'ACSZIPC' ref = { ACSZIPCRef }>{ COACTVW_CACTVWAStore.ACSZIPC }</div>
                <div className = 'ACSCITY' ref = { ACSCITYRef }>{ COACTVW_CACTVWAStore.ACSCITY }</div>
                <div className = 'ACSCTRY' ref = { ACSCTRYRef }>{ COACTVW_CACTVWAStore.ACSCTRY }</div>
                <div className = 'ACSPHN1' ref = { ACSPHN1Ref }>{ COACTVW_CACTVWAStore.ACSPHN1 }</div>
                <div className = 'ACSGOVT' ref = { ACSGOVTRef }>{ COACTVW_CACTVWAStore.ACSGOVT }</div>
                <div className = 'ACSPHN2' ref = { ACSPHN2Ref }>{ COACTVW_CACTVWAStore.ACSPHN2 }</div>
                <div className = 'ACSEFTC' ref = { ACSEFTCRef }>{ COACTVW_CACTVWAStore.ACSEFTC }</div>
                <div className = 'ACSPFLG' ref = { ACSPFLGRef }>{ COACTVW_CACTVWAStore.ACSPFLG }</div>
                <div className = 'INFOMSG' ref = { INFOMSGRef }>{ COACTVW_CACTVWAStore.INFOMSG }</div>
                <div className = 'ERRMSG' ref = { ERRMSGRef }>{ COACTVW_CACTVWAStore.ERRMSG }</div>
                <input className = 'ACCTSID'
                       type = 'text'
                       name = 'ACCTSID'
                       value = { COACTVW_CACTVWAStore.ACCTSID  || ''  }
                       onChange = { onKeyPressedACCTSID }
                       ref = { ACCTSIDRef }
                       maxLength = { 11.0 }
                ></input>
                <div className = '_field343'>Tran:</div>
                <div className = '_field346'>Date:</div>
                <div className = '_field348'>Prog:</div>
                <div className = '_field351'>Time:</div>
                <div className = '_field353'>View Account</div>
                <div className = '_field354'>Account Number :</div>
                <div className = '_field356'></div>
                <div className = '_field357'>Active Y/N: </div>
                <div className = '_field359'></div>
                <div className = '_field360'>Opened:</div>
                <div className = '_field362'></div>
                <div className = '_field363'>Credit Limit        :</div>
                <div className = '_field365'></div>
                <div className = '_field366'>Expiry:</div>
                <div className = '_field368'></div>
                <div className = '_field369'>Cash credit Limit   :</div>
                <div className = '_field371'></div>
                <div className = '_field372'>Reissue:</div>
                <div className = '_field374'></div>
                <div className = '_field375'>Current Balance     :</div>
                <div className = '_field377'></div>
                <div className = '_field378'>Current Cycle Credit:</div>
                <div className = '_field380'></div>
                <div className = '_field381'>Account Group:</div>
                <div className = '_field383'></div>
                <div className = '_field384'>Current Cycle Debit :</div>
                <div className = '_field386'></div>
                <div className = '_field387'>Customer Details</div>
                <div className = '_field388'>Customer id  :</div>
                <div className = '_field390'></div>
                <div className = '_field391'>SSN:</div>
                <div className = '_field393'></div>
                <div className = '_field394'>Date of birth:</div>
                <div className = '_field396'></div>
                <div className = '_field397'>FICO Score:</div>
                <div className = '_field399'></div>
                <div className = '_field400'>First Name</div>
                <div className = '_field401'>Middle Name: </div>
                <div className = '_field402'>Last Name : </div>
                <div className = '_field404'></div>
                <div className = '_field406'></div>
                <div className = '_field408'>Address:</div>
                <div className = '_field410'></div>
                <div className = '_field411'>State </div>
                <div className = '_field413'></div>
                <div className = '_field415'></div>
                <div className = '_field416'>Zip</div>
                <div className = '_field418'></div>
                <div className = '_field419'>City </div>
                <div className = '_field421'></div>
                <div className = '_field422'>Country</div>
                <div className = '_field424'></div>
                <div className = '_field425'>Phone 1:</div>
                <div className = '_field427'>Government Issued Id Ref    : </div>
                <div className = '_field429'></div>
                <div className = '_field430'>Phone 2:</div>
                <div className = '_field432'>EFT Account Id: </div>
                <div className = '_field434'></div>
                <div className = '_field435'>Primary Card Holder Y/N:</div>
                <div className = '_field437'></div>
                <div className = '_field439'></div>
                <div className = '_field440'></div>
                <div className = '_field442'>  F3=Exit </div>
            </div>
          </div>
        </div>
    );
});
export default COACTVW_CACTVWAView;


