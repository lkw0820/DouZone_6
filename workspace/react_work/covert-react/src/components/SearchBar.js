const SearchBar = () =>{
    return(
    <div>
        <div class="row g-3 mb-4">
            <div class="col-auto">
                <h2 class="mb-0" id="pageTitle">공급 제안 비교</h2>
            </div>
        </div>
        <div class="mb-4">
            <div class="d-flex flex-wrap gap-3">
            
                <div class="search-box" id="componentSearchBox">
                    <form class="position-relative" data-bs-toggle="search" data-bs-display="static" action="/comparsionSupplier" method="get">
                        <input class="form-control search-input search" type="search" placeholder="부품 검색창" aria-label="Search" name="compo_name" id="searchItemInput"/>
                        <span class="fas fa-search search-box-icon"></span>
                    </form>
                </div>
                <button class="btn btn-primary" id="searchItem">
                    <span class="fas fa-plus me-2"></span>검색
                </button> 
                <div class="ms-xxl-auto">
                    <button class="btn btn-primary" id="addSupplierBtn">
                        <span class="fas fa-plus me-2"></span>공급사 추가
                    </button>
                    <button class="btn btn-primary" id="addProdutBtn">
                        <span class="fas fa-plus me-2"></span>부품 추가
                    </button>
                </div>
            </div>
        </div>
    </div>
    )
}
export default SearchBar