import * as React from 'react';
import HeaderContainer from "../runtime/component/header/HeaderContainer";
import BarContainer from "../runtime/component/bar/BarContainer";
import COUSR02_COUSR2A from "../components/COUSR02_COUSR2A";
import FooterContainer from "../runtime/component/footer/FooterContainer";


const COUSR02_COUSR2APage = ({history, location}) => {
  return (
    <div>
      <HeaderContainer history={history}  location = {location}/>
        <center><COUSR02_COUSR2A history={history} location = {location}/></center>
        <center><FooterContainer history={history}/></center>
    </div>
  );
};

export default COUSR02_COUSR2APage;