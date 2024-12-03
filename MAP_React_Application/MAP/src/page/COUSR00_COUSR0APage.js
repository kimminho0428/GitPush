import * as React from 'react';
import HeaderContainer from "../runtime/component/header/HeaderContainer";
import BarContainer from "../runtime/component/bar/BarContainer";
import COUSR00_COUSR0A from "../components/COUSR00_COUSR0A";
import FooterContainer from "../runtime/component/footer/FooterContainer";


const COUSR00_COUSR0APage = ({history, location}) => {
  return (
    <div>
      <HeaderContainer history={history}  location = {location}/>
        <center><COUSR00_COUSR0A history={history} location = {location}/></center>
        <center><FooterContainer history={history}/></center>
    </div>
  );
};

export default COUSR00_COUSR0APage;