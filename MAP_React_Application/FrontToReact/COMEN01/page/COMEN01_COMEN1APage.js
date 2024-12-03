import * as React from 'react';
import HeaderContainer from "../runtime/component/header/HeaderContainer";
import BarContainer from "../runtime/component/bar/BarContainer";
import COMEN01_COMEN1A from "../components/COMEN01_COMEN1A";
import FooterContainer from "../runtime/component/footer/FooterContainer";


const COMEN01_COMEN1APage = ({history, location}) => {
  return (
    <div>
      <HeaderContainer history={history}  location = {location}/>
        <center><COMEN01_COMEN1A history={history} location = {location}/></center>
        <center><FooterContainer history={history}/></center>
    </div>
  );
};

export default COMEN01_COMEN1APage;