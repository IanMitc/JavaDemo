import React from 'react';

const Product = (props) => {
    return (
        <div className="col-sm-4">
        <div className="card">
        <img src={ 'http://rjtmobile.com/grocery/images/'+ props.data.image } className="card-img-top" alt="..." />
          <div className="card-body">
          <h5>{ props.data.productName }</h5>
            <p className="card-title">{ props.data.unit }</p>
            
            <h2>{ '\u00A3 '+ props.data.price } <del>{ '\u00A3 '+props.data.mrp }</del></h2>
            <p className="card-text">
              { props.data.description }
            </p>
            <a href="#" className="btn btn-primary btn-block">
              Add to Cart
            </a>
          </div>
        </div>
      </div>
    )
}
export default Product;