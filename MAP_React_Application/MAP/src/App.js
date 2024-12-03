import React, {useState} from 'react';
import {BrowserRouter, Switch, Route} from 'react-router-dom'
import {ToastProvider} from 'react-toast-notifications'

import COADM01_COADM1APage from "./page/COADM01_COADM1APage";
import COCRDSL_CCRDSLAPage from "./page/COCRDSL_CCRDSLAPage";
import COTRN02_COTRN2APage from "./page/COTRN02_COTRN2APage";
import CORPT00_CORPT0APage from "./page/CORPT00_CORPT0APage";
import COUSR00_COUSR0APage from "./page/COUSR00_COUSR0APage";
import COCRDUP_CCRDUPAPage from "./page/COCRDUP_CCRDUPAPage";
import COTRN00_COTRN0APage from "./page/COTRN00_COTRN0APage";
import COTRN01_COTRN1APage from "./page/COTRN01_COTRN1APage";
import COUSR01_COUSR1APage from "./page/COUSR01_COUSR1APage";
import COCRDLI_CCRDLIAPage from "./page/COCRDLI_CCRDLIAPage";
import COUSR02_COUSR2APage from "./page/COUSR02_COUSR2APage";
import COACTVW_CACTVWAPage from "./page/COACTVW_CACTVWAPage";
import COBIL00_COBIL0APage from "./page/COBIL00_COBIL0APage";
import COMEN01_COMEN1APage from "./page/COMEN01_COMEN1APage";
import COSGN00_COSGN0APage from "./page/COSGN00_COSGN0APage";
import COUSR03_COUSR3APage from "./page/COUSR03_COUSR3APage";
import COACTUP_CACTUPAPage from "./page/COACTUP_CACTUPAPage";
import TransactionPage from "./runtime/component/page/TransactionPage";
import RenewalPage from "./runtime/component/page/RenewalPage";
import PersonalSettingsPage from "./runtime/component/page/PersonalSettingsPage";

const App = () => {
  
  return (
    <ToastProvider>
      <BrowserRouter basename={process.env.REACT_APP_ROUTER_BASE || ''}>
        <div>
          <Switch>
            <Route exact path={'/'} component={TransactionPage} />
            <Route exact path={'/account/management'} component={RenewalPage} />
            <Route exact path={'/account/profile'} component={RenewalPage} />
            <Route exact path={'/account/personal-setting'} component={PersonalSettingsPage} />
            <Route exact path={'/account/auth'} component={RenewalPage} />
            <Route exact path={'/setting/environment'} component={RenewalPage} />
            <Route exact path={'/setting/alarm'} component={RenewalPage} />
            <Route exact path={'/setting/monitoring'} component={RenewalPage} />
            <Route exact path={'/COADM01_COADM1A'} component={ COADM01_COADM1APage } />
            <Route exact path={'/COCRDSL_CCRDSLA'} component={ COCRDSL_CCRDSLAPage } />
            <Route exact path={'/COTRN02_COTRN2A'} component={ COTRN02_COTRN2APage } />
            <Route exact path={'/CORPT00_CORPT0A'} component={ CORPT00_CORPT0APage } />
            <Route exact path={'/COUSR00_COUSR0A'} component={ COUSR00_COUSR0APage } />
            <Route exact path={'/COCRDUP_CCRDUPA'} component={ COCRDUP_CCRDUPAPage } />
            <Route exact path={'/COTRN00_COTRN0A'} component={ COTRN00_COTRN0APage } />
            <Route exact path={'/COTRN01_COTRN1A'} component={ COTRN01_COTRN1APage } />
            <Route exact path={'/COUSR01_COUSR1A'} component={ COUSR01_COUSR1APage } />
            <Route exact path={'/COCRDLI_CCRDLIA'} component={ COCRDLI_CCRDLIAPage } />
            <Route exact path={'/COUSR02_COUSR2A'} component={ COUSR02_COUSR2APage } />
            <Route exact path={'/COACTVW_CACTVWA'} component={ COACTVW_CACTVWAPage } />
            <Route exact path={'/COBIL00_COBIL0A'} component={ COBIL00_COBIL0APage } />
            <Route exact path={'/COMEN01_COMEN1A'} component={ COMEN01_COMEN1APage } />
            <Route exact path={'/COSGN00_COSGN0A'} component={ COSGN00_COSGN0APage } />
            <Route exact path={'/COUSR03_COUSR3A'} component={ COUSR03_COUSR3APage } />
            <Route exact path={'/COACTUP_CACTUPA'} component={ COACTUP_CACTUPAPage } />
          </Switch>    
        </div>
      </BrowserRouter>
    </ToastProvider>
  )
};

export default App;
