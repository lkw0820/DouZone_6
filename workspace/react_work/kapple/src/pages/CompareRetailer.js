import SearchBar from "../components/SearchBar"
import SupplierChart from "../components/CompanyChart";
import ComparsionChart from "../components/ComparsionChart";
import Graph from "../components/Graph";

const CompareRetailer = () => {
    return (
        <div className="container-fluid" >
            <SearchBar title={"판매 예측"}/>
            <div className="row">
                <div className="col-lg">
                    <SupplierChart heads={["no","name","ceo","cate","scale"]} classification={"상품"} retailer={true}/>
                </div>
                <div className="col-lg">
                    <ComparsionChart heads={["no","name","Product","sales_amount","구매자 등급","단가","운임 등급"]} retailer={true}/>
                    
                </div>
                
            </div>
            
        </div>
    );
}

export default CompareRetailer;