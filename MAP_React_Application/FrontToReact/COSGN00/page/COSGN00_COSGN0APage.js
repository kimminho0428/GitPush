import * as React from 'react';
import HeaderContainer from "../runtime/component/header/HeaderContainer";
import BarContainer from "../runtime/component/bar/BarContainer";
import COSGN00_COSGN0A from "../components/COSGN00_COSGN0A";
import FooterContainer from "../runtime/component/footer/FooterContainer";


const COSGN00_COSGN0APage = ({history, location}) => {
  return (
    <div>
      <HeaderContainer history={history}  location = {location}/>
        <center><COSGN00_COSGN0A history={history} location = {location}/></center>
        <center><FooterContainer history={history}/></center>
    </div>
  );
};

export default COSGN00_COSGN0APage;