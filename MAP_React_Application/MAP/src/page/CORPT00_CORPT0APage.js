import * as React from 'react';
import HeaderContainer from "../runtime/component/header/HeaderContainer";
import BarContainer from "../runtime/component/bar/BarContainer";
import CORPT00_CORPT0A from "../components/CORPT00_CORPT0A";
import FooterContainer from "../runtime/component/footer/FooterContainer";


const CORPT00_CORPT0APage = ({history, location}) => {
  return (
    <div>
      <HeaderContainer history={history}  location = {location}/>
        <center><CORPT00_CORPT0A history={history} location = {location}/></center>
        <center><FooterContainer history={history}/></center>
    </div>
  );
};

export default CORPT00_CORPT0APage;