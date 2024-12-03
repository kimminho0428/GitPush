import * as React from 'react';
import HeaderContainer from "../runtime/component/header/HeaderContainer";
import BarContainer from "../runtime/component/bar/BarContainer";
import COACTVW_CACTVWA from "../components/COACTVW_CACTVWA";
import FooterContainer from "../runtime/component/footer/FooterContainer";


const COACTVW_CACTVWAPage = ({history, location}) => {
  return (
    <div>
      <HeaderContainer history={history}  location = {location}/>
        <center><COACTVW_CACTVWA history={history} location = {location}/></center>
        <center><FooterContainer history={history}/></center>
    </div>
  );
};

export default COACTVW_CACTVWAPage;