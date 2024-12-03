import * as React from 'react';
import HeaderContainer from "../runtime/component/header/HeaderContainer";
import BarContainer from "../runtime/component/bar/BarContainer";
import COCRDUP_CCRDUPA from "../components/COCRDUP_CCRDUPA";
import FooterContainer from "../runtime/component/footer/FooterContainer";


const COCRDUP_CCRDUPAPage = ({history, location}) => {
  return (
    <div>
      <HeaderContainer history={history}  location = {location}/>
        <center><COCRDUP_CCRDUPA history={history} location = {location}/></center>
        <center><FooterContainer history={history}/></center>
    </div>
  );
};

export default COCRDUP_CCRDUPAPage;