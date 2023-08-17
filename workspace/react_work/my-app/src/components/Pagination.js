import PropTypes from 'prop-types';

const Pagination = ({currentPage, numberOfPages, onClick, limit}) =>{
    const currentSet = Math.ceil(currentPage/limit); 
    const startPage = limit*(currentSet-1)+1;//세트의 첫번째 수
    const lastSet = Math.ceil(numberOfPages/limit);
    //const numberOfPageForSet = currentSet === lastSet ? numberOfPages % limit :limit; //한세트당 페이지 개수
    const numberOfPageForSet = currentSet === lastSet && numberOfPages%limit !==0 ? numberOfPages % limit :limit;
    return (
        <nav aria-label="Page navigation example">
        <ul className="pagination justify-content-center">
            {currentSet!==1 &&<li className="page-item">
                <div 
                    className="page-link cursor-pointer" 
                    onClick={()=>onClick(startPage-limit)}
                >
                    Previous
                </div>
            </li>}

            {Array(numberOfPageForSet).fill(startPage).map((value,index)=>value+index)
                .map((pageNumber)=>{
                    return <li 
                                key={pageNumber}
                                className={`page-item ${currentPage === pageNumber ? 'active':''}`}
                            >
                                <div className="page-link cursor-pointer" onClick={()=>{onClick(pageNumber)}}>{pageNumber}</div>
                            </li>
                })
            }


            {currentSet!==lastSet &&<li className="page-item">
                <div 
                    className="page-link cursor-pointer"
                    onClick={()=>onClick(startPage+limit)}
                >
                    Next
                </div>
            </li>}
        </ul>
        </nav>
    )
}

Pagination.propTypes ={
    currentPage:PropTypes.number,
    numberOfPages:PropTypes.number.isRequired,
    onClick:PropTypes.func.isRequired,
    limit:PropTypes.number
}

Pagination.defaultProps = {
    currentPage:1,
    limit:5
}

export default Pagination;