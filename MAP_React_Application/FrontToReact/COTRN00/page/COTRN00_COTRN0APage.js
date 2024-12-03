import * as React from 'react';
import HeaderContainer from "../runtime/component/header/HeaderContainer";
import BarContainer from "../runtime/component/bar/BarContainer";
import COTRN00_COTRN0A from "../components/COTRN00_COTRN0A";
import FooterContainer from "../runtime/component/footer/FooterContainer";


const COTRN00_COTRN0APage = ({history, location}) => {
  return (
    <div>
      <HeaderContainer history={history}  location = {location}/>
        <center><COTRN00_COTRN0A history={history} location = {location}/></center>
        <center><FooterContainer history={history}/></center>
    </div>
  );
};

export default COTRN00_COTRN0APage;