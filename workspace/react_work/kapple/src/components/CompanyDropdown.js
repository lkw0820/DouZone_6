

const CompanyDropdown = ()=>{
    return (
        <td className='align-middle white-space-nowrap text-end pe-0'>
        <div className='font-sans-serif btn-reveal-trigger position-static'> 
          <button className='btn btn-sm dropdown-toggle dropdown-caret-none transition-none btn-reveal fs--2' type='button' data-bs-toggle='dropdown' data-boundary='window' aria-haspopup='true' aria-expanded='false' data-bs-reference='parent'>
            <span className='fas fa-ellipsis-h fs--2'></span>
          </button>
          <div className='dropdown-menu dropdown-menu-end py-2'>
            <a className='dropdown-item supplierDetail' href='#!' >View</a>
            <a className='dropdown-item' href='#!'>Export</a>
            <div className='dropdown-divider'></div>
            <a className='dropdown-item text-danger' href='#!'>Remove</a>
          </div>
        </div>
      </td>
    )
}

export default CompanyDropdown;