import React, { useState } from 'react';
import MenuItem from './MenuItem';
import { Menu, Button, Drawer } from 'antd';
import { EyeOutlined, YoutubeOutlined, VideoCameraOutlined, StarFilled} from '@ant-design/icons';

const { SubMenu } = Menu;

function Favorites( { favoriteItems }) {
    const [displayDrawer, setDisplayModal] = useState(false);
    const { videos, streams, clips } = favoriteItems; 

    const onDrawerClose = () => {
        setDisplayModal(false);
    }

    const onFavoriteClick = () => {
        setDisplayModal(true);
    }

    return (
        <>
            <Button type="primary" shape="round" onClick={onFavoriteClick} icon={<StarFilled />}>
                My Favorites
            </Button>
            <Drawer
            title="My Favorites"
            placement="right"
            width={720}
            visible={displayDrawer}
            onClose={onDrawerClose}
            >
                <Menu
                mode="inlined"
                defaultOpenKeys={['streams']}
                style={{ heights: '100%', borderRight: 0}}
                selectable={false}
                >
                    <SubMenu key={'streams'} icon={<EyeOutlined />} title="Streams">
                        <MenuItem items={streams} />
                    </SubMenu>
                    <SubMenu key={'videos'} icon={<YoutubeOutlined />} title="Videos">
                        <MenuItem items={videos} />
                    </SubMenu>
                    <SubMenu key={'clips'} icon={<VideoCameraOutlined />} title="Clips">
                        <MenuItem items={clips} />
                    </SubMenu>
                </Menu>
            </Drawer>
        </>
    )
}

export default Favorites;