import AddRetailer from "./pages/AddRetailer";
import AddSupplier from "./pages/AddSupplier";
import CompareRetailer from "./pages/CompareRetailer";
import CompareSupplier from "./pages/CompareSupplier";
import Home from "./pages/Home";
import ShowChart from "./pages/ShowChart";

const routes = [
    {
      path : "/",
      component : Home, 
    },
    {
      path : "/addSupplier",
      component : AddSupplier, 
    },
    {
      path : "/addRetailer",
      component : AddRetailer, 
    },
    {
      path : "/compareSupplier",
      component : CompareSupplier, 
    },
    {
      path : "/compareRetailer",
      component : CompareRetailer, 
    },
    {
      path : "/showChart",
      component : ShowChart, 
    },
  ];


  export default routes;