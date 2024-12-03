import * as React from 'react';
import HeaderContainer from "../runtime/component/header/HeaderContainer";
import BarContainer from "../runtime/component/bar/BarContainer";
import COCRDLI_CCRDLIA from "../components/COCRDLI_CCRDLIA";
import FooterContainer from "../runtime/component/footer/FooterContainer";


const COCRDLI_CCRDLIAPage = ({history, location}) => {
  return (
    <div>
      <HeaderContainer history={history}  location = {location}/>
        <center><COCRDLI_CCRDLIA history={history} location = {location}/></center>
        <center><FooterContainer history={history}/></center>
    </div>
  );
};

export default COCRDLI_CCRDLIAPage;