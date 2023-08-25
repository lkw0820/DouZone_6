import SearchBar from "../components/SearchBar"
import SupplierChart from "../components/CompanyChart";
import ComparsionChart from "../components/ComparsionChart";

const CompareSupplier = () => {
    return (
        <div className="container mt-100" >
            <SearchBar title={"공급 제안"}/>
            <div className="row">
                <div className="col-lg">
                    <SupplierChart heads={["no","name","ceo","cate"]} classification={"부품"} retailer={false}/>
                </div>
                <div className="col-lg">
                    <ComparsionChart heads={["no","name","Component","price","quantity","defective","quality","period"]} retailer={false}/>
                </div>
                
            </div>
            
        </div>
    );
}

export default CompareSupplier;