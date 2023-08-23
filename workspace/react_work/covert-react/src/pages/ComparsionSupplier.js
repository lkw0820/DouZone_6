import SearchBar from "../components/SearchBar"
import SupplierChart from "../components/CompanyChart";
import ComparsionChart from "../components/ComparsionChart";

const ComparsionSupplier = () =>{
    return (
        <div className="container" >
            <SearchBar/>
            <div className="row">
                <div className="col-lg">
                    <SupplierChart heads={["no","name","ceo","cate"]}/>
                </div>
                <div className="col-lg">
                    <ComparsionChart heads={["no","name","Component","price","quantity","defective","quality","period"]}/>
                </div>
                
            </div>
            
        </div>
    );
  }

export default ComparsionSupplier;
