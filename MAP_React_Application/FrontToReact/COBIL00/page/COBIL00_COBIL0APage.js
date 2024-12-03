import * as React from 'react';
import HeaderContainer from "../runtime/component/header/HeaderContainer";
import BarContainer from "../runtime/component/bar/BarContainer";
import COBIL00_COBIL0A from "../components/COBIL00_COBIL0A";
import FooterContainer from "../runtime/component/footer/FooterContainer";


const COBIL00_COBIL0APage = ({history, location}) => {
  return (
    <div>
      <HeaderContainer history={history}  location = {location}/>
        <center><COBIL00_COBIL0A history={history} location = {location}/></center>
        <center><FooterContainer history={history}/></center>
    </div>
  );
};

export default COBIL00_COBIL0APage;