import * as React from 'react';
import HeaderContainer from "../runtime/component/header/HeaderContainer";
import BarContainer from "../runtime/component/bar/BarContainer";
import COADM01_COADM1A from "../components/COADM01_COADM1A";
import FooterContainer from "../runtime/component/footer/FooterContainer";


const COADM01_COADM1APage = ({history, location}) => {
  return (
    <div>
      <HeaderContainer history={history}  location = {location}/>
        <center><COADM01_COADM1A history={history} location = {location}/></center>
        <center><FooterContainer history={history}/></center>
    </div>
  );
};

export default COADM01_COADM1APage;