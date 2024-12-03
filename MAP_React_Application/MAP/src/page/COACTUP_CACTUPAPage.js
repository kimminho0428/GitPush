import * as React from 'react';
import HeaderContainer from "../runtime/component/header/HeaderContainer";
import BarContainer from "../runtime/component/bar/BarContainer";
import COACTUP_CACTUPA from "../components/COACTUP_CACTUPA";
import FooterContainer from "../runtime/component/footer/FooterContainer";


const COACTUP_CACTUPAPage = ({history, location}) => {
  return (
    <div>
      <HeaderContainer history={history}  location = {location}/>
        <center><COACTUP_CACTUPA history={history} location = {location}/></center>
        <center><FooterContainer history={history}/></center>
    </div>
  );
};

export default COACTUP_CACTUPAPage;