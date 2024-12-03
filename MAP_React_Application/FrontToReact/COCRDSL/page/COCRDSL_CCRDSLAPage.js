import * as React from 'react';
import HeaderContainer from "../runtime/component/header/HeaderContainer";
import BarContainer from "../runtime/component/bar/BarContainer";
import COCRDSL_CCRDSLA from "../components/COCRDSL_CCRDSLA";
import FooterContainer from "../runtime/component/footer/FooterContainer";


const COCRDSL_CCRDSLAPage = ({history, location}) => {
  return (
    <div>
      <HeaderContainer history={history}  location = {location}/>
        <center><COCRDSL_CCRDSLA history={history} location = {location}/></center>
        <center><FooterContainer history={history}/></center>
    </div>
  );
};

export default COCRDSL_CCRDSLAPage;