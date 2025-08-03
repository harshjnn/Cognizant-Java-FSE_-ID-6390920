import React from 'react';

const App = () => {
  const officeSpaces = [
    { Name: 'DBS', Rent: 50000, Address: 'Chennai', Image: 'https://via.placeholder.com/200' },
  ];

  return (
    <div>
      <h1>Office Space, at Affordable Range</h1>
      {officeSpaces.map((item, index) => {
        const rentColor = item.Rent <= 60000 ? 'red' : 'green';

        return (
          <div key={index} style={{ border: '1px solid #ccc', margin: '20px', padding: '10px', alignContent:"center" }}>
            <img src={item.Image} alt="Office Space" width="25%" height="25%" />
            <h2>Name: {item.Name}</h2>
            <h3 style={{ color: rentColor }}>Rent: Rs. {item.Rent}</h3>
            <h3>Address: {item.Address}</h3>
          </div>
        );
      })}
    </div>
  );
};

export default App;
