import * as React from 'react';
import HeaderContainer from "../runtime/component/header/HeaderContainer";
import BarContainer from "../runtime/component/bar/BarContainer";
import COUSR01_COUSR1A from "../components/COUSR01_COUSR1A";
import FooterContainer from "../runtime/component/footer/FooterContainer";


const COUSR01_COUSR1APage = ({history, location}) => {
  return (
    <div>
      <HeaderContainer history={history}  location = {location}/>
        <center><COUSR01_COUSR1A history={history} location = {location}/></center>
        <center><FooterContainer history={history}/></center>
    </div>
  );
};

export default COUSR01_COUSR1APage;