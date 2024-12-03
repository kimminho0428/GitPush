import * as React from 'react';
import HeaderContainer from "../runtime/component/header/HeaderContainer";
import BarContainer from "../runtime/component/bar/BarContainer";
import COUSR03_COUSR3A from "../components/COUSR03_COUSR3A";
import FooterContainer from "../runtime/component/footer/FooterContainer";


const COUSR03_COUSR3APage = ({history, location}) => {
  return (
    <div>
      <HeaderContainer history={history}  location = {location}/>
        <center><COUSR03_COUSR3A history={history} location = {location}/></center>
        <center><FooterContainer history={history}/></center>
    </div>
  );
};

export default COUSR03_COUSR3APage;